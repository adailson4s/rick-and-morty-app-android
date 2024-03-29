package com.rickandmortyapi.data.datasource.remote.model

import com.google.gson.annotations.SerializedName

data class InfoModel(
    @SerializedName("count")
    var count: Int,
    @SerializedName("pages")
    var pages: Int,
    @SerializedName("next")
    var next: String?,
    @SerializedName("prev")
    var prev: String?
)
