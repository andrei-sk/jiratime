package eu.starbug.jiratime.presentation.feature.dashboard

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class DashboardComponentImpl(
    componentContext: ComponentContext
) : DashboardComponent, ComponentContext by componentContext {

    override val model = MutableValue(DashboardComponent.Model(0L))

    init {
        flow {
            var count = 0L
            while (true) {
                delay(1000L)
                emit(count++)
            }
        }.onEach {
            println(it)
            model.value = DashboardComponent.Model(count = it)
        }.launchIn(MainScope())
    }

}