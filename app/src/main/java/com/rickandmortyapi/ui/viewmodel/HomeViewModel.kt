package com.rickandmortyapi.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rickandmortyapi.data.datasource.remote.model.CharacterModel
import com.rickandmortyapi.data.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    private val _characterList = MutableStateFlow<List<CharacterModel>>(emptyList())
    val characterList = _characterList.asStateFlow()

    fun getCharacters(pageNumber: Int) = viewModelScope.launch {
        _characterList.update { characterRepository.get(pageNumber) }
    }
}