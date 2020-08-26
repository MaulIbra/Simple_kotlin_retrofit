package com.example.simple_kotlin_retrofit.api

import com.example.simple_kotlin_retrofit.model.Product
import com.example.simple_kotlin_retrofit.model.Wrapper
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */
interface ProductAPI {

    @GET(value = "menu/{id}")
    fun getMenuById(@Path("id") id:String):Call<Wrapper>

    @POST("menu")
    fun createProduct(@Body product: Product):Call<Wrapper>

}