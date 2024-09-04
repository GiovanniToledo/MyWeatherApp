package com.gtoledo.myweatherapp.api

import com.gtoledo.myweatherapp.DOGS_GET_ENDPOINT
import com.gtoledo.myweatherapp.URL_BASE
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private val okHttpClient = OkHttpClient
    .Builder()
    .addInterceptor(ApiServiceInterceptor)
    .build()

private val retrofit = Retrofit.Builder()
    .client(okHttpClient)
    .baseUrl(URL_BASE)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

interface ApiService {

    @GET(DOGS_GET_ENDPOINT)
    suspend fun getAllDogs(): Any


}

object DogsApi {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}