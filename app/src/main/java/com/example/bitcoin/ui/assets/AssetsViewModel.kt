package com.example.bitcoin.ui.assets



import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bitcoin.data.models.AssetsModel
import com.example.bitcoin.data.remote.ApiDetails
import com.example.bitcoin.data.remote.ApiRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AssetsViewModel : ViewModel() {

    private val _text = MutableLiveData<AssetsModel>()
    val vmText: LiveData<AssetsModel> = _text



    fun getAssets() {
        val result = ApiDetails.getAssetsInstance().create(ApiRequest::class.java)
        GlobalScope.launch {
            val response = result.getAsset()
            _text.postValue(response)
        }

    }
}
