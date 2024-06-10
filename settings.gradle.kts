@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "jiratime"
include(":data")
include(":domain")
include(":presentation")
include(":ui")
include(":app-android")
include(":app-desktop")
