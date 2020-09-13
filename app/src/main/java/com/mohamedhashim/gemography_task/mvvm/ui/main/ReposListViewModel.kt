package com.mohamedhashim.gemography_task.mvvm.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.mohamedhashim.gemography_task.data.entities.Repo
import com.mohamedhashim.gemography_task.mvvm.base.LiveCoroutinesViewModel
import com.mohamedhashim.gemography_task.mvvm.repository.GithubRepository

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class ReposListViewModel constructor(
    private val githubRepository: GithubRepository
) : LiveCoroutinesViewModel() {

    var reposListLiveData: LiveData<List<Repo>>
    private var repoPageLiveData: MutableLiveData<Int> = MutableLiveData()
    val toastLiveData: MutableLiveData<String> = MutableLiveData()

    init {

        this.reposListLiveData = this.repoPageLiveData.switchMap { page ->
            launchOnViewModelScope {
                this.githubRepository.loadStaredRepos(page) { this.toastLiveData.postValue(it) }
            }
        }
    }

    fun postRepoPage(page: Int) = this.repoPageLiveData.postValue(page)
}