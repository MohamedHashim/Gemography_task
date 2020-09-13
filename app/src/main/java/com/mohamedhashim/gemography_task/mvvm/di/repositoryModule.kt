package com.mohamedhashim.gemography_task.mvvm.di

import com.mohamedhashim.gemography_task.mvvm.repository.GithubRepository
import org.koin.dsl.module

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
val repositoryModule = module {
    single { GithubRepository(get()) }
}