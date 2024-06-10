package eu.starbug.jiratime.domain.feature.settings.repository

import eu.starbug.jiratime.domain.core.repository.OneInstanceRepository
import eu.starbug.jiratime.domain.feature.settings.model.Settings

interface SettingsRepository: OneInstanceRepository<Settings>