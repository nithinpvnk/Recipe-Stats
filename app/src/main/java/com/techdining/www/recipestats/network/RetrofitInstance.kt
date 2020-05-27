package com.techdining.www.recipestats.network


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://api.edamam.com/search"
    private val retrofitBuilder = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val retrofitService: RecipeApiService by lazy {
        retrofitBuilder.create(RecipeApiService::class.java)
    }
}