package com.gtoledo.myweatherapp.presentation.home

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gtoledo.myweatherapp.R
import com.gtoledo.myweatherapp.databinding.FragmentAirQualityBinding

class AirQualityFragment : Fragment() {

    companion object {
        fun newInstance() = AirQualityFragment()
    }

    private var _binding: FragmentAirQualityBinding? = null
    private val viewModel: AirQualityViewModel by viewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAirQualityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}