package com.gtoledo.myweatherapp.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.gtoledo.myweatherapp.presentation.home.ForecastFragment.Companion.ARG_OBJECT
class HomeOptionsAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position) {
            0 -> {
                fragment = ForecastFragment()
            }
            1 -> {
                fragment = AirQualityFragment()
            }
        }
        fragment?.arguments = Bundle().apply {
            // The object is just an integer.
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment ?: throw NotImplementedError("No fragment implementation found!")
    }
}