package eu.starbug.jiratime.presentation.feature.dashboard

import eu.starbug.jiratime.presentation.core.BaseComponent

interface DashboardComponent: BaseComponent<DashboardComponent.Model> {

    data class Model(
        val count: Long
    )

}