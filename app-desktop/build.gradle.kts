@file:Suppress("DSL_SCOPE_VIOLATION")

import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
}

kotlin {
    jvm {
        withJava()
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":data"))
                implementation(project(":domain"))
                implementation(project(":presentation"))

                implementation(compose.desktop.currentOs)
                implementation(libs.decompose.extensionsComposeJetbrains)
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "eu.starbug.jiratime.desktop.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "KotlinMultiplatformComposeDesktopApplication"
            packageVersion = libs.versions.project.get()
        }
    }
}
