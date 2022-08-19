package com.example.myapplication.network

import com.example.myapplication.model.Response
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("api/mvpd")
    fun getMsos(): Call<Response>
}