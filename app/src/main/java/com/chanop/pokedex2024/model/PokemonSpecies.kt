package com.chanop.pokedex2024.model


import com.google.gson.annotations.SerializedName

data class PokemonSpecies(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("url")
    val url: String? = null
)