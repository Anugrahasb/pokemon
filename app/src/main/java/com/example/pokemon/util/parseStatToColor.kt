package com.example.pokemon.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toLowerCase
import com.example.pokemon.data.remote.response.Stat
import com.example.pokemon.ui.theme.AtkColor
import com.example.pokemon.ui.theme.DefColor
import com.example.pokemon.ui.theme.HPColor
import com.example.pokemon.ui.theme.SpAtkColor
import com.example.pokemon.ui.theme.SpDefColor
import com.example.pokemon.ui.theme.SpdColor

fun parseStatToColor(stat: Stat):Color{
    return when(stat.stat.name.toLowerCase()){
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbb(stat: Stat):String{
    return when(stat.stat.name.toLowerCase()){
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}