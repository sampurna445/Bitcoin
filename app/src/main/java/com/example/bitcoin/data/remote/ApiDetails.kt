package com.example.bitcoin.data.remote

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiDetails {

    const val ASSETS_URL = "https://api.coincap.io"
    const val ASSETS_ENPOINT = "/v2/assets"

    const val RATES_URL = "https://api.coincap.io"
    const val RATES_ENDPOINT = "/v2/rates"

    const val EXCHANGES_URL = "https://api.coincap.io"
    const val EXCHANGES_ENDPOINT = "/v2/exchanges"

    const val MARKETS_URL = "https://api.coincap.io"
    const val MARKETS_ENDPOINT = "/v2/markets"

val client = OkHttpClient.Builder()
    .addInterceptor(HttpLoggingInterceptor().apply{
       level = HttpLoggingInterceptor.Level.BODY
}).build()

    fun getAssetsInstance(): Retrofit = getInstance(ASSETS_URL)
    fun getRatesInstance(): Retrofit = getInstance(RATES_URL)
    fun getExchangesInstance(): Retrofit = getInstance(EXCHANGES_URL)
    fun getMarketsInstance(): Retrofit = getInstance(MARKETS_URL)


    private fun getInstance(url: String): Retrofit = Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create(Gson()))
        .client(client)
        .build()


}

