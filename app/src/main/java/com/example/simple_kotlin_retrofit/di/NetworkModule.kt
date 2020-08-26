package com.example.simple_kotlin_retrofit.di

import com.example.simple_kotlin_retrofit.api.ProductAPI
import com.example.simple_kotlin_retrofit.config.RetrofitBuilder
import dagger.Module
import dagger.Provides

/**
 * Created by Maulana Ibrahim on 26/August/2020
 * Email maulibrahim19@gmail.com
 */
@Module
class NetworkModule {

    @Provides
    fun provideProductAPI():ProductAPI{
        return RetrofitBuilder.createRetrofit().create(ProductAPI::class.java)
    }

}