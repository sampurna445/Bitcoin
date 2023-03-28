package com.example.bitcoin.ui.rates

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bitcoin.data.models.RatesModel
import com.example.bitcoin.data.models.RatesDataModel
import com.example.bitcoin.data.remote.ApiDetails
import com.example.bitcoin.data.remote.ApiRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RatesViewModel : ViewModel() {

    private val _text = MutableLiveData<RatesModel>()
    val vmText: LiveData<RatesModel> = _text




    fun getRates(){
        val result = ApiDetails.getRatesInstance().create(ApiRequest::class.java)

        GlobalScope.launch {
            val response = result.getRate()
           // _text.postValue("${response.timestamp?.toULong()}")
            _text.postValue(response)
        }
    }



}