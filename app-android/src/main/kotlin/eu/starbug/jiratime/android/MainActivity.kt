package eu.starbug.jiratime.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.defaultComponentContext
import eu.starbug.jiratime.presentation.feature.root.RootComponentImpl
import eu.starbug.jiratime.ui.feature.root.RootContent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = RootComponentImpl(componentContext = defaultComponentContext())

        setContent {
            RootContent(component = root)
        }
    }
}
