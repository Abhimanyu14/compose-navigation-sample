package com.makeappssimple.abhimanyu.composenavigationsample.android.ui.activity

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {
    val data = "Main Activity View Model"

    init {
        Log.e("Test", "MainActivityViewModel")
    }
}
