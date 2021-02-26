package com.example.bit_pixnews.Interface


import com.example.bit_pixnews.Model.News
import com.example.bit_pixnews.Model.WebSite
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface NewsService {
    @get:GET(value = "v2/sources?apiKey=c71c8aab8bba49059aff9bdd506d62f5")
    val sources: Call<WebSite>

    @GET
    fun getNewsFromSource(@Url url: String): Call<News>
}