package com.adoyo.weatherapp.data.remote

data class WeatherDto(
    val humidity: Double,
    val temp: Double,
    val pressure: Double,
    val wind_speed: Double
)