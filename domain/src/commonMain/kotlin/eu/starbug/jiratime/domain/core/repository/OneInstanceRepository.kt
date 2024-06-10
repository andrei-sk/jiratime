package eu.starbug.jiratime.domain.core.repository

interface OneInstanceRepository<T> {

    suspend fun save(model: T)

    suspend fun read(): T?

}