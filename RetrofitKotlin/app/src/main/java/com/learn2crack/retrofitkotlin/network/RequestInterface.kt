package com.learn2crack.retrofitkotlin.network

import com.learn2crack.retrofitkotlin.model.Android
import io.reactivex.Observable
import retrofit2.http.GET

interface RequestInterface {

    @GET("api/android")
    fun getData() : Observable<List<Android>>
}
