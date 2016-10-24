package net.huray.kedditbysteps

import android.app.Application
import net.huray.kedditbysteps.di.AppModule
import net.huray.kedditbysteps.di.DaggerNewsComponent
import net.huray.kedditbysteps.di.NewsComponent

class KedditApp : Application() {
    companion object {
        lateinit var newsComponent: NewsComponent
    }

    override fun onCreate() {
        super.onCreate()
        newsComponent = DaggerNewsComponent.builder()
                .appModule(AppModule(this))
                .build();
    }
}
