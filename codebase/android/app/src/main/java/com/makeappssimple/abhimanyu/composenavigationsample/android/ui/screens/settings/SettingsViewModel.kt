package com.makeappssimple.abhimanyu.composenavigationsample.android.ui.screens.settings

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor() : ViewModel() {
    val data = "Settings View Model"

    init {
        Log.e("Test", "SettingsViewModel")
    }
}
