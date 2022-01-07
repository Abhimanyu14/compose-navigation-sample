package com.makeappssimple.abhimanyu.composenavigationsample.android.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.makeappssimple.abhimanyu.composenavigationsample.android.ui.activity.MainActivityViewModel

@Composable
fun HomeScreen(
    fragmentViewModel: HomeViewModel = hiltViewModel(),
    activityViewModel: MainActivityViewModel,
    navigateToSettings: () -> Unit,
) {
    Column {
        Text(text = activityViewModel.data)
        Text(text = fragmentViewModel.data)
        TextButton(onClick = { navigateToSettings() }) {
            Text(text = "navigate To Settings")
        }
    }
}
