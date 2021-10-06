package com.farinas.cryptocompose.presentation.coin_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farinas.cryptocompose.common.Resource
import com.farinas.cryptocompose.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

/**
 * Created by Erick Fariñas on 05/10/2021.
 */

@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {

    private val _state = mutableStateOf(CoinListState())
    val state: State<CoinListState> = _state

    init {
        getCoins()
    }

    private fun getCoins() {
        getCoinsUseCase().onEach { result ->
        when(result) {
            is Resource.Success -> {
                _state.value = CoinListState(coins = result.data ?: emptyList())
            }
            is Resource.Error -> {
                _state.value = CoinListState(error = result.message ?: "An unexpected error occured")
            }
            is Resource.Loading -> {
                _state.value = CoinListState(isLoading = true)
            }
        }
        }.launchIn(viewModelScope)
    }

}