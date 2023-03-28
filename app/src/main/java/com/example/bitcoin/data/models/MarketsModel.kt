package com.example.bitcoin.data.models


import com.google.gson.annotations.SerializedName

data class MarketsModel(
    @SerializedName("data")
    val `data`: List<MarketsDataModel?>? = listOf(),
    @SerializedName("timestamp")
    val timestamp: Long? = 0
)