package net.huray.kedditbysteps.di

import dagger.Module
import dagger.Provides
import net.huray.kedditbysteps.api.NewsAPI
import net.huray.kedditbysteps.api.NewsRestAPI
import net.huray.kedditbysteps.api.RedditApi
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NewsModule {

    @Provides
    @Singleton
    fun provideNewsApi(redditApi: RedditApi): NewsAPI =
            NewsRestAPI(redditApi)

    @Provides
    @Singleton
    fun provideRedditApi(retrofit: Retrofit): RedditApi =
            retrofit.create(RedditApi::class.java)
}
