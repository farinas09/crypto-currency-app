package com.farinas.cryptocompose.presentation

/**
 * Created by Erick Fariñas on 05/10/2021.
 */
sealed class Screen(val route: String) {
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
