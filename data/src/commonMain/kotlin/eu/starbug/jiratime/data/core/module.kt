package eu.starbug.jiratime.data.core

import eu.starbug.jiratime.data.feature.settings.repository.SettingsRepositoryImpl
import eu.starbug.jiratime.domain.feature.settings.repository.SettingsRepository
import org.koin.dsl.module

val dataModule = module {

    single<SettingsRepository> {
        SettingsRepositoryImpl()
    }

}