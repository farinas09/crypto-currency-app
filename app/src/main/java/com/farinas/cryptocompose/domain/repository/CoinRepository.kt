package com.farinas.cryptocompose.domain.repository

import com.farinas.cryptocompose.data.remote.dto.CoinDetailDto
import com.farinas.cryptocompose.data.remote.dto.CoinDto

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}