package com.marelso.designsystem.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.marelso.designsystem.ui.home.HomeScreenHoisting
import com.marelso.designsystem.ui.text.TextScreenHoisting

@Composable
fun NavGraph(navHostController: NavHostController, onClose: () -> Unit) {
    NavHost(
        navController = navHostController, startDestination = NavScreen.Home.route
    ) {
        composable(route = NavScreen.Home.route) {
            HomeScreenHoisting(navHostController = navHostController)
        }

        composable(route = NavScreen.Text.route) {
            TextScreenHoisting(navHostController = navHostController)
        }
    }
}