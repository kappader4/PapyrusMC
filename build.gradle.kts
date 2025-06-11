import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    `maven-publish`
    id("io.papermc.paperweight.patcher") version "2.0.0-beta.14"
}

val paperMavenPublicUrl = "https://repo.papermc.io/repository/maven-public/"
val papyrusMavenPublicUrl = "https://maven.nostal.ink/repository/maven-snapshots/"

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    extensions.configure<JavaPluginExtension> {
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }

    repositories {
        mavenCentral()
        maven(paperMavenPublicUrl)
        maven(papyrusMavenPublicUrl)
        maven("https://repo.bsdevelopment.org/releases/") // For ConfigurationMaster-API
    }

    tasks.withType<AbstractArchiveTask>().configureEach {
        isPreserveFileTimestamps = false
        isReproducibleFileOrder = true
    }

    tasks.withType<JavaCompile> {
        options.encoding = Charsets.UTF_8.name()
        options.release = 21
        options.isFork = true
        options.compilerArgs.addAll(listOf("-Xlint:-deprecation", "-Xlint:-removal"))
        options.forkOptions.memoryMaximumSize = "2g"
    }

    tasks.withType<Javadoc> {
        options.encoding = Charsets.UTF_8.name()
    }

    tasks.withType<ProcessResources> {
        filteringCharset = Charsets.UTF_8.name()
    }

    tasks.withType<Test> {
        testLogging {
            showStackTraces = true
            exceptionFormat = TestExceptionFormat.FULL
            events(TestLogEvent.STANDARD_OUT)
        }
    }

    extensions.configure<PublishingExtension> {
        repositories {
            maven(papyrusMavenPublicUrl) {
                name = "papyrus"

                credentials.username = System.getenv("REPO_USER")
                credentials.password = System.getenv("REPO_PASSWORD")
            }
        }
    }
}

paperweight {
    upstreams.register("gale") {
        repo = github("Dreeam-qwq", "Gale")
        ref = providers.gradleProperty("galeCommit")

        patchFile {
            path = "gale-server/build.gradle.kts"
            outputFile = file("papyrus-server/build.gradle.kts")
            patchFile = file("papyrus-server/build.gradle.kts.patch")
        }
        patchFile {
            path = "gale-api/build.gradle.kts"
            outputFile = file("papyrus-api/build.gradle.kts")
            patchFile = file("papyrus-api/build.gradle.kts.patch")
        }
        patchRepo("paperApi") {
            upstreamPath = "paper-api"
            patchesDir = file("papyrus-api/paper-patches")
            outputDir = file("paper-api")
        }
        patchDir("galeApi") {
            upstreamPath = "gale-api"
            excludes = listOf("build.gradle.kts", "build.gradle.kts.patch", "paper-patches")
            patchesDir = file("papyrus-api/gale-patches")
            outputDir = file("gale-api")
        }
    }
}
