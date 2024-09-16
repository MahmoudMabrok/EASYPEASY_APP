package com.example.eatsygo_app.source

import com.example.eatsygo_app.source.remote.ClotheApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val clothsApi: ClotheApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ClotheApi::class.java)
    }
}