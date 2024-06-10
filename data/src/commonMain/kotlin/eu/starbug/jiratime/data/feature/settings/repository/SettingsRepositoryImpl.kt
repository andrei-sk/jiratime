package eu.starbug.jiratime.data.feature.settings.repository

import eu.starbug.jiratime.domain.feature.settings.model.Settings
import eu.starbug.jiratime.domain.feature.settings.repository.SettingsRepository

class SettingsRepositoryImpl: SettingsRepository {
    override suspend fun save(model: Settings) {
        // TODO
    }

    override suspend fun read(): Settings? {
        return null // TODO
    }

}