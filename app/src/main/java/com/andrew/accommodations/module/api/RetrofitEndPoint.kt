package com.andrew.accommodations.module.api

import com.andrew.accommodations.module.api.RestApiUrl.ACCOMMODATION_PAGE_1
import com.andrew.accommodations.module.api.RestApiUrl.ACCOMMODATION_PAGE_2
import com.andrew.accommodations.module.api.RestApiUrl.ACCOMMODATION_PAGE_3
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Headers

interface RetrofitEndPoint {
    @GET(ACCOMMODATION_PAGE_1)
    @Headers("Content-Type: application/json")
    fun getAccommodationsPage1(): Observable<ResponseBody>

    @GET(ACCOMMODATION_PAGE_2)
    @Headers("Content-Type: application/json")
    fun getAccommodationsPage2(): Observable<ResponseBody>

    @GET(ACCOMMODATION_PAGE_3)
    @Headers("Content-Type: application/json")
    fun getAccommodationsPage3(): Observable<ResponseBody>
}