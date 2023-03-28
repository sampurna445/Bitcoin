package com.example.bitcoin.ui.exchanges

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bitcoin.R

import com.example.bitcoin.data.models.ExchangesDataModel
import com.example.bitcoin.databinding.ItemExchangesBinding


class ExchangesAdapter(val data: List<ExchangesDataModel?>?) :
    RecyclerView.Adapter<ExchangesAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        val binding = ItemExchangesBinding.bind(view)



        fun handleData(item: ExchangesDataModel) {
            binding.llExchangesTv1.text = item?.name
            binding.llExchangesTv2.text = item?.rank
            binding.llExchangesTv3.text = item?.volumeUsd
        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExchangesAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_exchanges, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: ExchangesAdapter.ViewHolder, position: Int) {
        data?.get(position)?.let { holder.handleData(it) }
    }

}
