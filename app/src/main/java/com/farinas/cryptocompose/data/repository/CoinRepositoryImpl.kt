package com.farinas.cryptocompose.data.repository

import com.farinas.cryptocompose.data.remote.CoinPaprikaApi
import com.farinas.cryptocompose.data.remote.dto.CoinDetailDto
import com.farinas.cryptocompose.data.remote.dto.CoinDto
import com.farinas.cryptocompose.domain.repository.CoinRepository
import javax.inject.Inject

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoin(coinId)
    }
}