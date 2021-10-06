package com.farinas.cryptocompose.data.remote

import com.farinas.cryptocompose.data.remote.dto.CoinDetailDto
import com.farinas.cryptocompose.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoin(@Path("coinId") coinId: String): CoinDetailDto

}