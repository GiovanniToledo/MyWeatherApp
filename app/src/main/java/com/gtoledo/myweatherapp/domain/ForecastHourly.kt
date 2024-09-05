package com.gtoledo.myweatherapp.domain

import kotlinx.parcelize.Parcelize

@Parcelize
class HourlyForecast(val id: Int, val date: Long, val imgResource: Int):  {
}