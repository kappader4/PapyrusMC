import io.papermc.paperweight.util.*
import io.papermc.paperweight.tasks.*

plugins {
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.14"
    kotlin("jvm") version "1.9.22" // or your preferred Kotlin version
}

paperweight {
    upstreams {
        register("papyrusBase") {
            setRepo("https://github.com/PaperMC/Paper.git")
            setRef("ver/1.21.4")

            withStandardPatcher {
                apiPatchDir.set(file("papyrus-api/patches"))
                apiOutputDir.set(file("paper-api"))
                serverPatchDir.set(file("papyrus-server/patches"))
                serverOutputDir.set(file("paper-server"))
            }
        }
    }
}