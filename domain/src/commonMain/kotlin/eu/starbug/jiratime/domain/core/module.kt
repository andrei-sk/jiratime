package eu.starbug.jiratime.domain.core

import eu.starbug.jiratime.domain.core.usecase.SupplierUseCase
import eu.starbug.jiratime.domain.feature.settings.repository.SettingsRepository
import eu.starbug.jiratime.domain.feature.settings.usecase.GetSettingsUseCase
import eu.starbug.jiratime.domain.feature.settings.usecase.GetSettingsUseCaseImpl
import org.koin.core.module.Module
import org.koin.core.qualifier.qualifier
import org.koin.dsl.module

/**
 * Use-cases
 */
val domainModule = module {

    /*useCaseFactory(
        implementation = SettingsRepository::read,
        name = "GetSettingsUseCase"
    )*/

    factory<GetSettingsUseCase> {
        GetSettingsUseCaseImpl(
            settingsRepository = get()
        )
    }

}

private inline fun <OUTPUT, reified REPOSITORY : Any> Module.useCaseFactory(
    crossinline implementation: (suspend REPOSITORY.() -> OUTPUT),
    name: String,
) {
    factory(qualifier = qualifier(name)) {
        object : SupplierUseCase<OUTPUT> {
            val repository = get<REPOSITORY>()
            override suspend fun execute(): OUTPUT = implementation(repository)
        }
    }
}