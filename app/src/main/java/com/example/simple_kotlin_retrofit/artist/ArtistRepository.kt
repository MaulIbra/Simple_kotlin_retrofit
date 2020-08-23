package com.example.simple_kotlin_retrofit.artist

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */
class ArtistRepository(val artistApi: ArtistApi) {
    val artist:MutableLiveData<Artist> = MutableLiveData()

    fun getArtist(id:String){
        artistApi.getArtistById(id).enqueue(object :Callback<Artist> {
            override fun onFailure(call: Call<Artist>, t: Throwable) {
                println(t.localizedMessage)
            }

            override fun onResponse(call: Call<Artist>, response: Response<Artist>) {
                artist.value = response.body()
            }

        })
    }
}