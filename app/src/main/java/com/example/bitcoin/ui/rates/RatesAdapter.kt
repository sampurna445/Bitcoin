package com.example.bitcoin.ui.rates

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bitcoin.R
import com.example.bitcoin.data.models.AssetsDataModel
import com.example.bitcoin.data.models.RatesDataModel
import com.example.bitcoin.databinding.ItemRatesBinding

class RatesAdapter(val data: List<RatesDataModel?>?) :
    RecyclerView.Adapter<RatesAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val binding = ItemRatesBinding.bind(view)

        fun handleData(item: RatesDataModel) {
            binding.llRatesTv1.text = item?.rateUsd
            binding.llRatesTv2.text = item?.currencySymbol
            binding.llRatesTv3.text = item?.id




        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):RatesAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rates,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data?.size?:0

    override fun onBindViewHolder(holder: RatesAdapter.ViewHolder, position: Int) {
        data?.get(position)?.let { holder.handleData(it) }
    }

}
