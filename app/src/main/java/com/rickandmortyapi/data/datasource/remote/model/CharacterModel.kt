package com.rickandmortyapi.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    @SerializedName("id")
    var id: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("status")
    var status: String,
    @SerializedName("species")
    var species: String,
    @SerializedName("type")
    var type: String,
    @SerializedName("gender")
    var gender: String,
    @SerializedName("origin")
    var origin: NameAndLinkModel,
    @SerializedName("location")
    var location: NameAndLinkModel,
    @SerializedName("image")
    var image: String,
    @SerializedName("episode")
    var episode: Array<String>,
    @SerializedName("url")
    var url: String,
    @SerializedName("created")
    var created: String
)