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
        gradlePluginPortal()
        maven { setUrl("https://jitpack.io") }
        mavenCentral()
    }
}

rootProject.name = "ToastyTest"
include(":app")
include(":FenilToasty")
