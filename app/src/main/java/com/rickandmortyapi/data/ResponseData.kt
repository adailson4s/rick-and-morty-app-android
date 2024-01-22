package com.rickandmortyapi.data

sealed class ResponseData<out T : Any> {
    class Success<out T : Any>(val ret: T) : ResponseData<T>()
    class Error(val error: ErrorResponse) : ResponseData<Nothing>()
}