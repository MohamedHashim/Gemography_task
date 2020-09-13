package com.mohamedhashim.gemography_task.network.service

import com.mohamedhashim.gemography_task.data.resposne.StaredReposResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
interface GithubRepoService {
    @GET()
    fun fetchStaredRepos(@Query("page") page: Int): Call<StaredReposResponse>

}