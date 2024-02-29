package com.marelso.designsystem.navigation

sealed class NavScreen(val title: String, val route: String) {
    data object Home: NavScreen(title = "Home", route = "home/")
}