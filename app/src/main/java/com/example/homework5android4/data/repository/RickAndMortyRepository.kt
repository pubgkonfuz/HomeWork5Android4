package com.example.homework5android4.data.repository

import com.example.homework5android4.data.remote.RetrofitClient

class RickAndMortyRepository {

    private val apiService = RetrofitClient.rickAndMortyApiService

    suspend fun getCharacter() = apiService.getCharacters()

    suspend fun getLocation() = apiService.getLocations()
}