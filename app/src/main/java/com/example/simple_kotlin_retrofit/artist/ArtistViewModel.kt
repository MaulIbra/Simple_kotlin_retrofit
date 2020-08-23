package com.example.simple_kotlin_retrofit.artist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.simple_kotlin_retrofit.config.RetrofitBuilder

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */
class ArtistViewModel:ViewModel() {

    private val artistRepository:ArtistRepository

    init{
        val artistApi = RetrofitBuilder.createRetrofit().create(ArtistApi::class.java)
        artistRepository = ArtistRepository(artistApi = artistApi)
    }

    val artist:LiveData<Artist> = artistRepository.artist

    fun getArtist(id:String){
        artistRepository.getArtist(id)
    }
}