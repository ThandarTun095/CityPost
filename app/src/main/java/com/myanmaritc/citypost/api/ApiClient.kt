package com.myanmaritc.citypost.api

import com.myanmaritc.citypost.model.City
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApiClient {

    private val BASE_URL = "https://food-delivery-api.chaneihmwe.com/api/"

    private val apiInterface : ApiInterface

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiInterface = retrofit.create(
            ApiInterface :: class.java
        )
    }

    fun addCity(cityName : String): Call<City>{
        return apiInterface.addCity(cityName)
    }



}