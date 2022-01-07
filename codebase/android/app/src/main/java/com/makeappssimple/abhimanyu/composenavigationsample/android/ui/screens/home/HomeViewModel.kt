package com.makeappssimple.abhimanyu.composenavigationsample.android.ui.screens.home

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    val data = "Home View Model"

    init {
        Log.e("Test", "HomeViewModel")
    }
}
