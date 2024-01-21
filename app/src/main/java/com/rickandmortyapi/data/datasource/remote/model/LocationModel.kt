package com.rickandmortyapi.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class LocationModel(
    @SerializedName("name")
    var name : String,
    @SerializedName("url")
    var url : String,
)