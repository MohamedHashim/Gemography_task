package com.mohamedhashim.gemography_task.mvvm.di

import com.mohamedhashim.gemography_task.mvvm.ui.main.ReposListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
val viewModelModule = module {
    viewModel { ReposListViewModel(get()) }
}