package com.mohamedhashim.gemography_task.data.entities

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class Repo(
    var page: Int,
    val id: Int,
    var name: String,
    var description: String,
    var stargazers_count: Int,
    var owner: List<Owner>
)