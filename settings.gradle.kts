pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    // Use the default repositories mode instead of FAIL_ON_PROJECT_REPOS
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT) // or RepositoriesMode.FAIL_ON_PROJECT_REPOS if still needed

    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Portfolio"
include(":app")
