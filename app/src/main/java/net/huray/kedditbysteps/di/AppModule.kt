package net.huray.kedditbysteps.di

import android.content.Context
import dagger.Module
import dagger.Provides
import net.huray.kedditbysteps.KedditApp
import javax.inject.Singleton

@Module
class AppModule(val app: KedditApp) {

    @Provides
    @Singleton
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun provideApplication(): KedditApp = app

}

