package com.example.tabs

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit
sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun){

    object Home : TabItem(R.drawable.ic_home, "Home", { HomeScreen() })
    object Profile : TabItem(R.drawable.ic_profile, "Profile", { ProfileScreen() })
    object Settings : TabItem(R.drawable.ic_settings, "Settings", { SettingsScreen() })

}