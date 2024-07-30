package com.example.pokemon.data.remote

import com.example.pokemon.data.remote.response.PokemonDetails
import com.example.pokemon.data.remote.response.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit")limit:Int,
        @Query("offset")offset:Int
    ):PokemonList

    @GET("pokemon/{id}")
    suspend fun getPokemonInfo(
       @Path("id")id:Int
    ):PokemonDetails
}