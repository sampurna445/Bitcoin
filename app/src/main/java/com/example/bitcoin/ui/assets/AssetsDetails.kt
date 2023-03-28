package com.example.bitcoin.ui.assets

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bitcoin.R

class AssetsDetails : Fragment() {

    companion object {
        fun newInstance() = AssetsDetails()
    }

    private lateinit var viewModel: AssetsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_assets_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AssetsDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}