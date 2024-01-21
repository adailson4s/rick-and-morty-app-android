package com.rickandmortyapi.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.rickandmortyapi.ui.theme.Dimen
import com.rickandmortyapi.ui.theme.RickAndMortyTheme
import com.rickandmortyapi.ui.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    dimens: Dimen,
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val characterList by viewModel.characterList.collectAsState()
    var textValue by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimens.default),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(
            value = textValue,
            onValueChange = {textValue = it},
            label = { Text(text = "Digite um número") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(dimens.default))
        Button(
            onClick = { viewModel.getCharacters(textValue.toInt()) }
        ) {
            Text(text = "Acessar a API")
        }
        Spacer(modifier = Modifier.height(dimens.default))
        Text(text = "Lista do character \n${characterList}")
    }
}

@Preview(showBackground = true)
@Composable
private fun ExampleOneScreenPreview() {
    RickAndMortyTheme {
        HomeScreen(
            dimens = Dimen(),
            navController = NavController(LocalContext.current)
        )
    }
}