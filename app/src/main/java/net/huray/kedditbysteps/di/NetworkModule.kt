package net.huray.kedditbysteps.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
            Retrofit.Builder()
                    .baseUrl("https://www.reddit.com")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
}
