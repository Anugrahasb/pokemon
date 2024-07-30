package com.example.pokemon.repository

import androidx.compose.ui.geometry.Offset
import com.example.pokemon.data.remote.PokeApi
import com.example.pokemon.data.remote.response.PokemonDetails
import com.example.pokemon.data.remote.response.PokemonList
import com.example.pokemon.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {
    suspend fun getPokemonList(limit:Int,offset: Int): Resource<PokemonList>{
        val response = try{
            api.getPokemonList(limit, offset)
        } catch (e: Exception){
            return Resource.Error("An unknown error occured.")
        }
        return  Resource.Success(response)
    }

    suspend fun getPokemonInfo(id: Int): Resource<PokemonDetails>{
        val response = try{
            api.getPokemonInfo(id)
        } catch (e: Exception){
            return Resource.Error("An unknown error occured.")
        }
        return  Resource.Success(response)
    }
}