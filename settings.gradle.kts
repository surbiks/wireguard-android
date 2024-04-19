@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        maven {
            url = uri("https://maven")
            credentials {
                username = "maven2-reader"
                password = "maven2-reader"
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://maven")
            credentials {
                username = "maven2-reader"
                password = "maven2-reader"
            }
        }
    }
}

rootProject.name = "wireguard-android"

include(":bridge")
include(":tunnel")
include(":ui")
