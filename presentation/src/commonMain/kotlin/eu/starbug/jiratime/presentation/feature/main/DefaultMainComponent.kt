package eu.starbug.jiratime.presentation.feature.main

import com.arkivanov.decompose.ComponentContext

class DefaultMainComponent(
    componentContext: ComponentContext,
    private val onShowWelcome: () -> Unit,
) : MainComponent, ComponentContext by componentContext {

    override fun onShowWelcomeClicked() {
        onShowWelcome()
    }
}
