package com.mohamedhashim.gemography_task.data.resposne

import com.mohamedhashim.gemography_task.data.entities.Repo

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class StaredReposResponse(
    val page: Int,
    val items: List<Repo>
)