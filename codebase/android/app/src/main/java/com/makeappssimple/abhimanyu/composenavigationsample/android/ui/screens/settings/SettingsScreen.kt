package com.makeappssimple.abhimanyu.composenavigationsample.android.ui.screens.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.makeappssimple.abhimanyu.composenavigationsample.android.ui.activity.MainActivityViewModel

@Composable
fun SettingsScreen(
    fragmentViewModel: SettingsViewModel = hiltViewModel(),
    activityViewModel: MainActivityViewModel,
) {
    Column {
        Text(text = activityViewModel.data)
        Text(text = fragmentViewModel.data)
    }
}
