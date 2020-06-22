package com.kotlinblo.blogspot.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.kotlinblo.blogspot.repository.MainRepository
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(val mainRepository: MainRepository): ViewModel() {

}