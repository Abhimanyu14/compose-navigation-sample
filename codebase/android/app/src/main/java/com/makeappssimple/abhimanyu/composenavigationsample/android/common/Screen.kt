package com.makeappssimple.abhimanyu.composenavigationsample.android.common

sealed class Screen(
    val route: String,
) {
    object Home : Screen(
        route = "home",
    )

    object Settings : Screen(
        route = "settings",
    )
}
