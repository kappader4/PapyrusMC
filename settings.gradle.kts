import java.util.Locale

include("paper-api")
include("paper-server")
include("papyrus-api")
include("papyrus-server")
project(":papyrus-api").projectDir = file("papyrus-api")
project(":papyrus-server").projectDir = file("papyrus-server")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "leaf"

for (name in listOf("leaf-api", "leaf-server")) {
    val projName = name.lowercase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
