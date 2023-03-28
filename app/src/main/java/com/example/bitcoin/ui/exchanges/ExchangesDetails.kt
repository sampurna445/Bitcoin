package com.example.bitcoin.ui.exchanges

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bitcoin.R

class ExchangesDetails : Fragment() {

    companion object {
        fun newInstance() = ExchangesDetails()
    }

    private lateinit var viewModel: ExchangesDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exchanges_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExchangesDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}