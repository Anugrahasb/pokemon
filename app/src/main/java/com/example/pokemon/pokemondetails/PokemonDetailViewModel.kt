package com.example.pokemon.pokemondetails

import androidx.lifecycle.ViewModel
import com.example.pokemon.data.remote.response.PokemonDetails
import com.example.pokemon.repository.PokemonRepository
import com.example.pokemon.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonId: String): Resource<PokemonDetails> {
        return repository.getPokemonInfo(pokemonId)

    }
}