package com.example.bmicalculatorviewmodelproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.example.bmicalculatorviewmodelproject.databinding.FragmentResultBinding
import com.example.bmicalculatorviewmodelproject.viewmodel.BmiViewModel

class ResultFragment : Fragment() {
    private lateinit var binding : FragmentResultBinding
    private lateinit var viewModel: BmiViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentResultBinding.inflate(inflater,container,false)

        viewModel = ViewModelProvider(requireActivity()).get(BmiViewModel::class.java)

        binding.scoreTv.text = String.format("%.1f",viewModel.bmi)

        binding.catagoryTv.text = viewModel.catagory
        return binding.root
    }
}