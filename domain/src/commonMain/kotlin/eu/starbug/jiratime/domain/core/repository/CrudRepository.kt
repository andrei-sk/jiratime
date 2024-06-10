package eu.starbug.jiratime.domain.core.repository

interface CrudRepository<T, ID> {

    suspend fun save(model: T)

    suspend fun getById(id: ID): T?

    suspend fun getAll(): List<T>

    suspend fun deleteById(id: ID)

}