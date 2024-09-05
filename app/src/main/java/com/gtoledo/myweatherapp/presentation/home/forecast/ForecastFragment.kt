package com.gtoledo.myweatherapp.presentation.home

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gtoledo.myweatherapp.R
import com.gtoledo.myweatherapp.databinding.FragmentForecastBinding

class ForecastFragment : Fragment() {

    companion object {
        const val ARG_OBJECT = "object"
        fun newInstance() = ForecastFragment()
    }

    private var _binding: FragmentForecastBinding? = null
    private val viewModel: ForecastViewModel by viewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForecastBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}