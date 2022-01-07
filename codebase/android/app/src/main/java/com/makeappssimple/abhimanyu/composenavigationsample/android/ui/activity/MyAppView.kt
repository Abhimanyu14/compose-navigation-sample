package com.makeappssimple.abhimanyu.composenavigationsample.android.ui.activity

import androidx.compose.runtime.Composable
import com.makeappssimple.abhimanyu.composenavigationsample.android.navigation.MyNavGraph

@Composable
fun MyAppView(
    activityViewModel: MainActivityViewModel,
) {
    MyNavGraph(
        activityViewModel = activityViewModel,
    )
}
