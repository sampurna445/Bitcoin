package com.example.bitcoin.data.remote

import com.example.bitcoin.data.models.AssetsModel
import com.example.bitcoin.data.models.ExchangesModel
import com.example.bitcoin.data.models.MarketsModel
import com.example.bitcoin.data.models.RatesModel

import retrofit2.http.GET

interface ApiRequest {

    @GET(ApiDetails.ASSETS_ENPOINT)
    suspend fun getAsset(): AssetsModel

    @GET(ApiDetails.RATES_ENDPOINT)
    suspend fun getRate(): RatesModel

    @GET(ApiDetails.EXCHANGES_ENDPOINT)
    suspend fun getExchange(): ExchangesModel

    @GET(ApiDetails.MARKETS_ENDPOINT)
    suspend fun getMarket(): MarketsModel
}