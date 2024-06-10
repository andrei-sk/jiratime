package eu.starbug.jiratime.presentation.feature.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import eu.starbug.jiratime.presentation.feature.dashboard.DashboardComponent
import eu.starbug.jiratime.presentation.feature.main.MainComponent
import eu.starbug.jiratime.presentation.feature.welcome.WelcomeComponent

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    fun onBackClicked(toIndex: Int)

    sealed class Child {
        class Main(val component: MainComponent) : Child()
        class Welcome(val component: WelcomeComponent) : Child()
        class Dashboard(val component: DashboardComponent): Child()
    }
}
