package com.example.weatherapp.service

import com.example.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


//https://api.openweathermap.org/data/2.5/weather?q=istanbul&appid=b376e45f76b29e99322bb06fc492f794
interface WeatherAPI {

    @GET("data/2.5/weather?&units=metric&appid=b376e45f76b29e99322bb06fc492f794")
    fun getData(
        @Query("q") cityName: String
    ):Single<WeatherModel>


}