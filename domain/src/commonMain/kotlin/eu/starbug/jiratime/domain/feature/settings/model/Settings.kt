package eu.starbug.jiratime.domain.feature.settings.model

data class Settings(
    val url: String,
    val token: String,
    val isTotalTimeVisible: Boolean,
    val isCurrentTimeVisible: Boolean
) {
    companion object {
        val DEFAULT = Settings(
            url = "",
            token = "",
            isTotalTimeVisible = true,
            isCurrentTimeVisible = true
        )
    }
}