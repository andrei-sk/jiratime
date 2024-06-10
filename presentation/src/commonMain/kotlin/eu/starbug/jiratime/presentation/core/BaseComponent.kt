package eu.starbug.jiratime.presentation.core

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.subscribeAsState
import com.arkivanov.decompose.value.Value

interface BaseComponent<MODEL: Any> {

    val model: Value<MODEL>

    @Composable
    fun subscribeToModel() = model.subscribeAsState().value
}