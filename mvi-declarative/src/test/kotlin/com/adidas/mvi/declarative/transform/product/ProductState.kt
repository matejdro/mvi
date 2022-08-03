package com.adidas.mvi.declarative.transform.product

import com.adidas.mvi.LoggableState

sealed class ProductState : LoggableState {
    object Loading : ProductState()
    object Loaded : ProductState()
}
