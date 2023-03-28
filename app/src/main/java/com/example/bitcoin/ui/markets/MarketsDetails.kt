package com.example.bitcoin.ui.markets

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bitcoin.R

class MarketsDetails : Fragment() {

    companion object {
        fun newInstance() = MarketsDetails()
    }

    private lateinit var viewModel: MarketsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_markets_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MarketsDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}