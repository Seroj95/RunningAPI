package com.kotlinblo.blogspot.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.kotlinblo.blogspot.R
import com.kotlinblo.blogspot.ui.viewmodels.StaticViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticFragment :Fragment(R.layout.fragment_statistics){
    private val viewModel:StaticViewModel by viewModels()

}