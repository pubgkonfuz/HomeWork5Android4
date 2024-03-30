package com.example.homework5android4.data.remote.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results")
    val results: List<ResultItemCharacter>?,
    @SerializedName("info")
    val info: Info
)
