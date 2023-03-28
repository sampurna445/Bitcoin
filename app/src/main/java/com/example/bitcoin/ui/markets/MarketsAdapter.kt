package com.example.bitcoin.ui.markets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bitcoin.R

import com.example.bitcoin.data.models.MarketsModel
import com.example.bitcoin.data.models.MarketsDataModel
import com.example.bitcoin.databinding.ItemMarketsBinding

class MarketsAdapter(val data: List<MarketsDataModel?>?) : RecyclerView.Adapter<MarketsAdapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val binding = ItemMarketsBinding.bind(view)


        fun handleData(item: MarketsDataModel) {
            binding.llMarketsTv1.text =item?.baseId
            binding.llMarketsTv2.text = item?.rank
            binding.llMarketsTv3.text = item?.priceUsd
        }





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_markets,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data?.size?:0

    override fun onBindViewHolder(holder: MarketsAdapter.ViewHolder, position: Int) {
        data?.get(position)?.let { holder.handleData(it) }
    }

}
