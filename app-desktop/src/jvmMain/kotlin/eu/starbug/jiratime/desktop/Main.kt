package eu.starbug.jiratime.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.extensions.compose.lifecycle.LifecycleController
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import eu.starbug.jiratime.presentation.feature.root.RootComponentImpl
import eu.starbug.jiratime.ui.feature.root.RootContent

fun main() {

    val lifecycle = LifecycleRegistry()

    val root = runOnUiThread {
        RootComponentImpl(
            componentContext = DefaultComponentContext(lifecycle = lifecycle),
        )
    }

    application {
        val windowState = rememberWindowState()

        LifecycleController(lifecycle, windowState)

        Window(
            onCloseRequest = ::exitApplication,
            state = windowState,
            title = "JiraTime"
        ) {
            RootContent(root)
        }
    }
}
