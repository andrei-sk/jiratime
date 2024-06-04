package eu.starbug.jiratime.shared.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import eu.starbug.jiratime.shared.main.MainComponent
import eu.starbug.jiratime.shared.welcome.WelcomeComponent

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    fun onBackClicked(toIndex: Int)

    sealed class Child {
        class Main(val component: MainComponent) : Child()
        class Welcome(val component: WelcomeComponent) : Child()
    }
}
