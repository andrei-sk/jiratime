package eu.starbug.jiratime.root

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import eu.starbug.jiratime.presentation.feature.root.RootComponent
import platform.UIKit.UIViewController

fun rootViewController(root: RootComponent): UIViewController =
    ComposeUIViewController {
        RootContent(component = root, modifier = Modifier.fillMaxSize())
    }
