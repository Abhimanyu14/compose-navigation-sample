package com.makeappssimple.abhimanyu.composenavigationsample.android.ui.activity

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelStoreOwner
import com.makeappssimple.abhimanyu.composenavigationsample.android.navigation.MyNavGraph

@Composable
fun MyAppView(
    activityViewModel: MainActivityViewModel,
    viewModelStoreOwner:ViewModelStoreOwner,
) {
    MyNavGraph(
        activityViewModel = activityViewModel,
        viewModelStoreOwner=viewModelStoreOwner,
    )
}
