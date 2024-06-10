package eu.starbug.jiratime.domain.core.usecase

interface UseCase

interface SupplierUseCase<OUTPUT>: UseCase {

    suspend operator fun invoke(): OUTPUT = execute()

    suspend fun execute(): OUTPUT

}

interface ConsumerUseCase<INPUT>: UseCase {

    suspend operator fun invoke(input: INPUT) = execute(input)

    suspend fun execute(input: INPUT)

}

interface FunctionUseCase<INPUT, OUTPUT>: UseCase {

    suspend operator fun invoke(input: INPUT): OUTPUT = execute(input)

    suspend fun execute(input: INPUT): OUTPUT

}