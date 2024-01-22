package com.rickandmortyapi.data

import com.rickandmortyapi.R

enum class ErrorResponse(val str: Int) {
    API_CONNECTION_FAILED(str = R.string.api_connection_failed)
}