package net.huray.kedditbysteps.di

import dagger.Component
import net.huray.kedditbysteps.featrues.news.NewsFragment
import javax.inject.Singleton

@Component(modules = arrayOf(
        AppModule::class,
        NewsModule::class,
        NetworkModule::class
))
@Singleton
interface NewsComponent {
    fun inject(newsFragment: NewsFragment)
}
