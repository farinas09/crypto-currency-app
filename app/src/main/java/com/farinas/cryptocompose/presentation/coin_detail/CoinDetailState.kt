package com.farinas.cryptocompose.presentation.coin_detail

import com.farinas.cryptocompose.domain.model.CoinDetail

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
data class CoinDetailState (
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)