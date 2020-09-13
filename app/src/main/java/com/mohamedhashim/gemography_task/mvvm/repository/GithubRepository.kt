package com.mohamedhashim.gemography_task.mvvm.repository

import androidx.lifecycle.MutableLiveData
import com.mohamedhashim.gemography_task.data.entities.Repo
import com.mohamedhashim.gemography_task.network.ApiResponse
import com.mohamedhashim.gemography_task.network.client.GithubRepoClient
import com.mohamedhashim.gemography_task.network.message
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class GithubRepository constructor(
    private val repoClient: GithubRepoClient
) {

    suspend fun loadStaredRepos(page: Int, error: (String) -> Unit) =
        withContext(Dispatchers.IO) {
            val liveData = MutableLiveData<List<Repo>>()
            var repos = emptyList<Repo>()
            repoClient.fetchStaredRepos(page) { response ->
                when (response) {
                    is ApiResponse.Success -> {
                        response.data?.let { data ->
                            repos = data.items
                            repos.forEach { it.page = page }
                            liveData.apply { postValue(repos) }
                        }
                    }
                    is ApiResponse.Failure.Error -> error(response.message())
                    is ApiResponse.Failure.Exception -> error(response.message())
                }
            }
            liveData.apply { postValue(repos) }
        }
}