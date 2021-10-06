package com.farinas.cryptocompose.domain.model

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
