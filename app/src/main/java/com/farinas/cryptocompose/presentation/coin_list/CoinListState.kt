package com.farinas.cryptocompose.presentation.coin_list

import com.farinas.cryptocompose.domain.model.Coin

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
data class CoinListState (
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)