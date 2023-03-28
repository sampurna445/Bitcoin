package com.example.bitcoin.ui.rates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitcoin.data.models.AssetsModel
import com.example.bitcoin.data.models.RatesModel
import com.example.bitcoin.databinding.FragmentRatesBinding
import com.example.bitcoin.ui.assets.AssetsAdapter
import com.example.bitcoin.ui.rates.RatesViewModel

class RatesFragment : Fragment() {

    private var _binding: FragmentRatesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ratesViewModel =
            ViewModelProvider(this).get(RatesViewModel::class.java)

        _binding = FragmentRatesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        ratesViewModel.vmText.observe(viewLifecycleOwner){
            it?.let {
                setupUI(it)

            }

        }
        ratesViewModel.getRates()
        return root
    }
    private  fun setupUI(rates: RatesModel){
        binding.rvRates.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = RatesAdapter(rates.data)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}