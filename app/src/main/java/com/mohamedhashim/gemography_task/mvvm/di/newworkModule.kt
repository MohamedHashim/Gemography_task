package com.mohamedhashim.gemography_task.mvvm.di

import com.mohamedhashim.gemography_task.network.Endpoint
import com.mohamedhashim.gemography_task.network.RequestInterceptor
import com.mohamedhashim.gemography_task.network.client.GithubRepoClient
import com.mohamedhashim.gemography_task.network.service.GithubRepoService
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(RequestInterceptor())
            .build()
    }

    single {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .baseUrl(Endpoint.Github)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single { get<Retrofit>().create(GithubRepoService::class.java) }

    single { GithubRepoClient(get()) }
}
