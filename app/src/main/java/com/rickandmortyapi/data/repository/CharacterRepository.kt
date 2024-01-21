package com.rickandmortyapi.data.repository

import com.rickandmortyapi.data.datasource.remote.endpoint.CharacterService
import com.rickandmortyapi.data.datasource.remote.model.CharacterModel
import retrofit2.Response
import javax.inject.Inject

class CharacterRepository @Inject constructor(private val characterService: CharacterService) {

    suspend fun get(pageNumber: Int): List<CharacterModel> {
        val result = characterService.getCountries(pageNumber)
        return if (result.isSuccessful) {
            result.body()?.results!!
        } else {
            emptyList()
        }
    }
}