package com.mohamedhashim.gemography_task.data.entities

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class Repo(
    val id: Int,
    val name: String,
    val description: String,
    val stargazers_count: Int,
    val owner: List<Owner>
)