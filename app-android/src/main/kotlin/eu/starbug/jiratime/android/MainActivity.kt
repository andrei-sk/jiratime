package eu.starbug.jiratime.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.defaultComponentContext
import eu.starbug.jiratime.root.RootContent
import eu.starbug.jiratime.shared.root.DefaultRootComponent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = DefaultRootComponent(componentContext = defaultComponentContext())

        setContent {
            RootContent(component = root)
        }
    }
}
