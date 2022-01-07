package com.makeappssimple.abhimanyu.composenavigationsample.android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.makeappssimple.abhimanyu.composenavigationsample.android.common.Screen
import com.makeappssimple.abhimanyu.composenavigationsample.android.ui.activity.MainActivityViewModel
import com.makeappssimple.abhimanyu.composenavigationsample.android.ui.screens.home.HomeScreen
import com.makeappssimple.abhimanyu.composenavigationsample.android.ui.screens.settings.SettingsScreen

@Composable
fun MyNavGraph(
    activityViewModel: MainActivityViewModel,
    viewModelStoreOwner: ViewModelStoreOwner,
) {
    val navHostController = rememberNavController()
    val myNavActions = remember(navHostController) {
        MyNavActions(navHostController)
    }

    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route,
    ) {
        composable(
            route = Screen.Home.route,
        ) { navBackStackEntry ->
            CompositionLocalProvider(
                LocalViewModelStoreOwner provides viewModelStoreOwner
            ) {
                HomeScreen(
                    activityViewModel = activityViewModel,
                    navigateToSettings = {
                        myNavActions.navigateTo(
                            navBackStackEntry,
                            Screen.Settings.route,
                        )
                    },
                )
            }
        }
        composable(
            route = Screen.Settings.route,
        ) { navBackStackEntry ->
            CompositionLocalProvider(
                LocalViewModelStoreOwner provides viewModelStoreOwner
            ) {
                SettingsScreen(
                    activityViewModel = activityViewModel,
                )
            }
        }
    }
}
