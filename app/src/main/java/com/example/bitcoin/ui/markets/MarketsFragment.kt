package com.example.bitcoin.ui.markets;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.bitcoin.data.models.MarketsModel

import com.example.bitcoin.databinding.FragmentMarketsBinding


public class MarketsFragment : Fragment (){
    private var _binding : FragmentMarketsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val marketsViewModel =
            ViewModelProvider(this).get(MarketsViewModel::class.java)

        _binding = FragmentMarketsBinding.inflate(inflater, container, false)
        val root: View = binding.root



        marketsViewModel.vmText.observe(viewLifecycleOwner){
            it?.let {
                setupUI(it)

            }

        }

        marketsViewModel.getMarkets()
        return root
    }
    private  fun setupUI(markets: MarketsModel){
        binding?.rvMarkets?.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = MarketsAdapter(markets.data)
        }
    }

}
