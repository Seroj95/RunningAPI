package com.kotlinblo.blogspot.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.kotlinblo.blogspot.R
import com.kotlinblo.blogspot.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment :Fragment(R.layout.fragment_run){
private  val viewModel:MainViewModel by viewModels ()
}