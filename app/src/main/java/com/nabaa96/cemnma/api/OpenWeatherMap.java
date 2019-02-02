package com.nabaa96.cemnma.api;

import com.nabaa96.cemnma.Model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherMap {
    @GET("weather")
    Call<WeatherResponse> getWeatherbylatlang(@Query("lat") String lat,
                                              @Query("lon") String lng,
                                              @Query("appid") String appid,
                                              @Query("units") String units);

}
