package com.example.bitcoin.ui.assets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitcoin.data.models.AssetsModel
import com.example.bitcoin.databinding.FragmentAssetsBinding


class AssetsFragment : Fragment() {

    private var _binding: FragmentAssetsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val assetsViewModel =
            ViewModelProvider(this).get(AssetsViewModel::class.java)

        _binding = FragmentAssetsBinding.inflate(inflater, container, false)
        val root: View = binding.root



        assetsViewModel.vmText.observe(viewLifecycleOwner){
            it?.let {
                setupUI(it)

            }

        }

        assetsViewModel.getAssets()
        return root
    }
    private  fun setupUI(assets: AssetsModel){
        binding.rvAssets.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AssetsAdapter(assets.data)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}