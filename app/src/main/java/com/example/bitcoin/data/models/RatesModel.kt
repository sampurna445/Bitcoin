package com.example.bitcoin.data.models


import com.google.gson.annotations.SerializedName

data class RatesModel(
    @SerializedName("data")
    val `data`: List<RatesDataModel?>? = listOf(),
    @SerializedName("timestamp")
    val timestamp: Long? = 0
)