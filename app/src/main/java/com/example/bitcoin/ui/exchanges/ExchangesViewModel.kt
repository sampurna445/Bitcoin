package com.example.bitcoin.ui.exchanges

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bitcoin.data.models.ExchangesModel
import com.example.bitcoin.data.remote.ApiDetails
import com.example.bitcoin.data.remote.ApiRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ExchangesViewModel : ViewModel() {

    private val _text = MutableLiveData<ExchangesModel>()
    val vmText: LiveData<ExchangesModel> = _text

    fun getExchanges(){

        val result = ApiDetails.getExchangesInstance().create(ApiRequest::class.java)

        GlobalScope.launch(){
            val response = result.getExchange()

            _text.postValue(response)
        }
    }
}