package com.rickandmortyapi.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavController

sealed class Routes(
    val route: String,
    val arguments: List<NamedNavArgument> = listOf()
) {
    data object HomeScreen : Routes(route = Screen.HOME_SCREEN.name) {
        fun NavController.toHomeScreen() = navigate(route) {
            popBackStack(route, true)
        }
    }

    data object TwoScreen : Routes(route = Screen.TWO_SCREEN.name) {
        fun NavController.toHomeScreen() = navigate(route)
    }
}

private enum class Screen {
    HOME_SCREEN,
    TWO_SCREEN
}