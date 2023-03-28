package com.example.bitcoin.ui.markets



import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bitcoin.data.models.MarketsDataModel
import com.example.bitcoin.data.models.MarketsModel
import com.example.bitcoin.data.remote.ApiDetails
import com.example.bitcoin.data.remote.ApiRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MarketsViewModel: ViewModel() {

    private val _text = MutableLiveData<MarketsModel>()
    val vmText: LiveData<MarketsModel> = _text



    fun getMarkets() {
        val result = ApiDetails.getMarketsInstance().create(ApiRequest::class.java)
        GlobalScope.launch {
            val response = result.getMarket()
            _text.postValue(response)
        }

    }
}
