package com.mohamedhashim.gemography_task

import android.app.Application
import com.mohamedhashim.gemography_task.mvvm.di.networkModule
import com.mohamedhashim.gemography_task.mvvm.di.repositoryModule
import com.mohamedhashim.gemography_task.mvvm.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(networkModule)
            modules(viewModelModule)
            modules(repositoryModule)
        }
    }
}
