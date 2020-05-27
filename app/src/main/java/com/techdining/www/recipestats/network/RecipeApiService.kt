package com.techdining.www.recipestats.network

import com.techdining.www.recipestats.dataModels.RecipeModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApiService {

    @GET("search")
    fun getRecipes(
        @Query("q") searchKeyword: String,
        @Query("app_id") appId: String,
        @Query("app_key") apiKey: String
    ): Call<RecipeModel>
}