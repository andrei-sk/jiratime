package eu.starbug.jiratime.domain.feature.settings.usecase

import eu.starbug.jiratime.domain.feature.settings.model.Settings
import eu.starbug.jiratime.domain.feature.settings.repository.SettingsRepository

class GetSettingsUseCaseImpl(
    private val settingsRepository: SettingsRepository
) : GetSettingsUseCase {
    override suspend fun execute() = settingsRepository.read()
}