package eu.starbug.jiratime.android

import android.app.Application
import eu.starbug.jiratime.data.core.dataModule
import eu.starbug.jiratime.domain.core.domainModule
import org.koin.core.context.startKoin

class JiraTimeApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                dataModule,
                domainModule
            )
        }

    }


}