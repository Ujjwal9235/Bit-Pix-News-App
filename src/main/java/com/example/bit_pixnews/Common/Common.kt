package com.example.bit_pixnews.Common

import com.example.bit_pixnews.Interface.NewsService
import com.example.bit_pixnews.Remote.RetrofitClient
import java.lang.StringBuilder
import javax.xml.transform.Source

object Common{
    val BASE_URL = "https://newsapi.org/"
    val API_KEY = "c71c8aab8bba49059aff9bdd506d62f5"

    val newsService:NewsService
    get()=RetrofitClient.getClient(BASE_URL).create(NewsService::class.java)

    /*https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=c71c8aab8bba49059aff9bdd506d62f5*/
    fun getNewsAPI(source: String): String{
        val apiUrl = StringBuilder("https://newsapi.org/v2/top-headlines?sources=")
            .append(source)
            .append("&apiKey=")
            .append(API_KEY)
            .toString()

         return apiUrl
    }
}