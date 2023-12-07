pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "demo"
include(":app")
include(":demoihm")
include(":demokotlin")
include(":enishop")
include(":viewdatabinding")
include(":navcomponent")
include(":menu")
include(":intent")
