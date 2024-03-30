package com.example.homework5android4.data.remote.locationmodel

import com.google.gson.annotations.SerializedName

data class LocationResponse(
    @SerializedName("results")
    val results: List<ResultItemLocation>?,
    @SerializedName("info")
    val info: Info
)
