package eu.starbug.jiratime.presentation.feature.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.popTo
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import eu.starbug.jiratime.presentation.feature.dashboard.DashboardComponentImpl
import eu.starbug.jiratime.presentation.feature.main.DefaultMainComponent
import eu.starbug.jiratime.presentation.feature.main.MainComponent
import eu.starbug.jiratime.presentation.feature.root.RootComponent.Child
import eu.starbug.jiratime.presentation.feature.welcome.DefaultWelcomeComponent
import eu.starbug.jiratime.presentation.feature.welcome.WelcomeComponent
import kotlinx.serialization.Serializable

class RootComponentImpl(
    componentContext: ComponentContext,
) : RootComponent, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, Child>> =
        childStack(
            source = navigation,
            serializer = Config.serializer(),
            initialConfiguration = Config.Dashboard,
            handleBackButton = true,
            childFactory = ::child,
        )

    private fun child(config: Config, context: ComponentContext): Child =
        when (config) {
            is Config.Main -> Child.Main(mainComponent(context))
            is Config.Welcome -> Child.Welcome(welcomeComponent(context))
            is Config.Dashboard -> Child.Dashboard(DashboardComponentImpl(context))
        }

    private fun mainComponent(componentContext: ComponentContext): MainComponent =
        DefaultMainComponent(
            componentContext = componentContext,
            onShowWelcome = { navigation.push(Config.Welcome) },
        )

    private fun welcomeComponent(componentContext: ComponentContext): WelcomeComponent =
        DefaultWelcomeComponent(
            componentContext = componentContext,
            onFinished = navigation::pop,
        )

    override fun onBackClicked(toIndex: Int) {
        navigation.popTo(index = toIndex)
    }

    @Serializable
    private sealed interface Config {
        @Serializable
        data object Main : Config

        @Serializable
        data object Welcome : Config

        @Serializable
        data object Dashboard: Config
    }
}
