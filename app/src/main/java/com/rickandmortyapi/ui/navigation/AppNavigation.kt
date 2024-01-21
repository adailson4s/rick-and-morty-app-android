package com.rickandmortyapi.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rickandmortyapi.ui.screen.HomeScreen
import com.rickandmortyapi.ui.screen.TwoScreen
import com.rickandmortyapi.ui.theme.Dimen

@Composable
fun AppNavigation(navHostController: NavHostController) {
    val dimens = Dimen()

    NavHost(navController = navHostController, startDestination = Routes.HomeScreen.route) {

        composable(route = Routes.HomeScreen.route) {
            HomeScreen(
                dimens = dimens,
                navController = navHostController
            )
        }

        composable(route = Routes.TwoScreen.route) {
            TwoScreen(
                dimens = dimens,
                navController = navHostController
            )
        }
    }
}