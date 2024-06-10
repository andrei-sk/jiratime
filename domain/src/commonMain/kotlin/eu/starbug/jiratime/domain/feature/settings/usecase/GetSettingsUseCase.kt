package eu.starbug.jiratime.domain.feature.settings.usecase

import eu.starbug.jiratime.domain.core.usecase.SupplierUseCase
import eu.starbug.jiratime.domain.feature.settings.model.Settings
import eu.starbug.jiratime.domain.feature.settings.repository.SettingsRepository
import org.koin.core.qualifier.Qualifier
import org.koin.core.qualifier.QualifierValue
import org.koin.core.qualifier.named

interface GetSettingsUseCase: SupplierUseCase<Settings?>