package com.andrew.accommodations.module.api

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object RestApiUrl {
    const val BASE_URL = "https://www.gccompany.co.kr/App"
    const val ACCOMMODATION_PAGE_1 = BASE_URL.plus("/json/1.json")
    const val ACCOMMODATION_PAGE_2 = BASE_URL.plus("/json/2.json")
    const val ACCOMMODATION_PAGE_3 = BASE_URL.plus("/json/3.json")
}