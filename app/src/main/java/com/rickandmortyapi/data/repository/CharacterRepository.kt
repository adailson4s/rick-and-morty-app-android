package com.rickandmortyapi.data.repository

import com.rickandmortyapi.data.ErrorResponse
import com.rickandmortyapi.data.ResponseData
import com.rickandmortyapi.data.datasource.remote.endpoint.CharacterService
import com.rickandmortyapi.data.datasource.remote.model.CharacterModel
import javax.inject.Inject

class CharacterRepository @Inject constructor(private val characterService: CharacterService) {

    suspend fun get(pageNumber: Int): ResponseData<List<CharacterModel>> {
        val result = characterService.getCountries(pageNumber)
        return if (result.isSuccessful) {
            ResponseData.Success(result.body()?.results!!)
        } else {
            ResponseData.Error(ErrorResponse.API_CONNECTION_FAILED)
        }
    }
}