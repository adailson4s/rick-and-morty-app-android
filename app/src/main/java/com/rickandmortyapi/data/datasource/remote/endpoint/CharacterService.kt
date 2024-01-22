package com.rickandmortyapi.data.datasource.remote.endpoint

import com.rickandmortyapi.data.datasource.remote.model.BodyModel
import com.rickandmortyapi.data.datasource.remote.model.CharacterModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterService {
    @GET("character/")
    suspend fun getCountries(@Query("page") pageNumber: Int): Response<BodyModel<CharacterModel>>
}