package com.farinas.cryptocompose.domain.model

import com.farinas.cryptocompose.data.remote.dto.TeamMember

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
