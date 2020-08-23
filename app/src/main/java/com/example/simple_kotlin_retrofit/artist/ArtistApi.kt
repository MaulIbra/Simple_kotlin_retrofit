package com.example.simple_kotlin_retrofit.artist

import com.example.simple_kotlin_retrofit.product.Product
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */
interface ArtistApi {

    @GET(value = "artist/{id}")
    fun getArtistById(@Path("id") id:String): Call<Artist>

}