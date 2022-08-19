package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("MSOs")
    val msos: List<MSO>
)

data class MSO(
    @SerializedName("IconURL")
    val iconURL: String,
    @SerializedName("Rank")
    val rank: Int
)
