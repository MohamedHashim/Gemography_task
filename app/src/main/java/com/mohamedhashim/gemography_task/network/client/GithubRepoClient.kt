package com.mohamedhashim.gemography_task.network.client

import com.mohamedhashim.gemography_task.data.resposne.StaredReposResponse
import com.mohamedhashim.gemography_task.network.ApiResponse
import com.mohamedhashim.gemography_task.network.service.GithubRepoService
import com.mohamedhashim.gemography_task.network.transform

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class GithubRepoClient(private val service: GithubRepoService) {

    fun fetchStaredRepos(
        page: Int,
        onResult: (response: ApiResponse<StaredReposResponse>) -> Unit
    ) {
        this.service.fetchStaredRepos(page).transform(onResult)
    }

}