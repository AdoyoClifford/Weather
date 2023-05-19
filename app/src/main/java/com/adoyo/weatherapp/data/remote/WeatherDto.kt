package com.adoyo.weatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    val humidity: Double,
    @field:Json(name = "temp")
    val temperature: Double,
    val pressure: Double,
    @field:Json(name = "wind_speed")
    val windSpeed: Double
)