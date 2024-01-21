package com.rickandmortyapi.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class BodyModel(
    @SerializedName("info")
    var info : InfoModel,
    @SerializedName("results")
    var results: List<CharacterModel>
)
