package com.example.simple_kotlin_retrofit.config

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */

class RetrofitBuilder {
    companion object {
        val BASE_URL = "http://10.0.2.2:4000/"

        fun createRetrofit(): Retrofit {
            return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}