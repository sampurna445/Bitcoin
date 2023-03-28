package com.example.bitcoin.ui.assets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.bitcoin.R
import com.example.bitcoin.data.models.AssetsDataModel

import com.example.bitcoin.databinding.ItemAssetsBinding

class AssetsAdapter( val data: List<AssetsDataModel?>?) :
    RecyclerView.Adapter<AssetsAdapter.ViewHolder>() {

    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        val binding = ItemAssetsBinding.bind(view)

        fun handleData(item: AssetsDataModel) {
           binding.llAssetsTv1.text = item?.name
            binding.llAssetsTv2.text = item?.rank
            binding.llAssetsTv3.text = item?.priceUsd
        }





    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):AssetsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_assets,parent,false)
        return ViewHolder(view)
    }



    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: AssetsAdapter.ViewHolder, position: Int) {
        data?.get(position)?.let { holder.handleData(it) }


    }

}
