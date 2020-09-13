package com.mohamedhashim.gemography_task.mvvm.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mohamedhashim.gemography_task.R

/**
 * Created by Mohamed Hashim on 9/13/2020.
 */
class ReposListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.fragment_repos_list, container,false)
    }
}