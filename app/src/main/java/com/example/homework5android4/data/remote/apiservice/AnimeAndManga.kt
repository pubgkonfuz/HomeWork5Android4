package com.example.homework5android4.data.remote.apiservice

import com.example.homework5android4.data.remote.locationmodel.LocationResponse
import com.example.homework5android4.data.remote.model.CharacterResponse
import retrofit2.http.GET

private const val CHARACTERS_END_POINT = "character"
private const val LOCATIONS_END_POINT = "location"

interface RickAndMortyApiService {

    @GET(CHARACTERS_END_POINT)
    suspend fun getCharacters(): CharacterResponse

    @GET(LOCATIONS_END_POINT)
    suspend fun getLocations(): LocationResponse

}