package com.rickandmortyapi.ui.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.rickandmortyapi.ui.theme.Dimen
import com.rickandmortyapi.ui.viewmodel.TwoViewModel

@Composable
fun TwoScreen(
    dimens: Dimen,
    navController: NavController,
    viewModel: TwoViewModel = hiltViewModel()
) {
}