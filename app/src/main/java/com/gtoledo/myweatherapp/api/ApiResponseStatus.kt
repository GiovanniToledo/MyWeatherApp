package com.gtoledo.myweatherapp.api

sealed class ApiResponseStatus<T> {
    class Success<T>(val data: T) : ApiResponseStatus<T>()
    class Error<T>(val message: Int) : ApiResponseStatus<T>()
    class Loading<T>: ApiResponseStatus<T>()
}
