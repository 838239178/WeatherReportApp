package com.thread0.weather.net.service


import com.thread0.weather.data.model.*
import com.thread0.weather.net.WEATHER_PRIVATE_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface LifeService {
    @GET("/v3/life/driving_restriction.json")
    suspend fun getCityCarRestriction(
        @Query("key") key: String = WEATHER_PRIVATE_KEY,
        @Query("location") location: String,
    ): RestrictionResultFromServer?

    @GET("/v3/life/chinese_calendar.json")
    suspend fun getChineseCalendar(
        @Query("start") start: Int = 0,
        @Query("days") days: Int = 7,
        @Query("key") key: String = WEATHER_PRIVATE_KEY,
    ): CalendarResultFromServer?
}