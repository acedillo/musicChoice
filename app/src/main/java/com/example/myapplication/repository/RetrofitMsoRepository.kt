package com.example.myapplication.repository

import com.example.myapplication.model.MSO
import com.example.myapplication.model.Response
import com.example.myapplication.network.ApiClient
import com.example.myapplication.network.ApiInterface

class RetrofitMsoRepository: MsoRepository {

    override fun getMSOs(): List<MSO> {
        val apiService = ApiClient.getClient().create(ApiInterface::class.java)
        val call = apiService.getMsos()
        val response = call.execute()
        return response.body()?.msos ?: emptyList()
    }
}