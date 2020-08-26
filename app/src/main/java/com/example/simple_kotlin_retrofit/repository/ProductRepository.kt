package com.example.simple_kotlin_retrofit.repository

import androidx.lifecycle.MutableLiveData
import com.example.simple_kotlin_retrofit.model.Product
import com.example.simple_kotlin_retrofit.api.ProductAPI
import com.example.simple_kotlin_retrofit.model.Wrapper
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback
import javax.inject.Inject

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */
class ProductRepository @Inject constructor(private val productAPI: ProductAPI) {

    val product: MutableLiveData<Product> = MutableLiveData()

    fun getProduct(id: String) {
        productAPI.getMenuById(id).enqueue(object : Callback<Wrapper> {
            override fun onFailure(call: Call<Wrapper>, t: Throwable) {
                println(t.localizedMessage)
            }

            override fun onResponse(call: Call<Wrapper>, response: Response<Wrapper>) {
                val responseProduct = response.body()
                val res = responseProduct?.data
                val gson = Gson()
                product.value = gson.fromJson(gson.toJson(res),
                    Product::class.java)
            }
        })
    }

    fun createProduct(product: Product){
        productAPI.createProduct(product).enqueue(object :Callback<Wrapper>{
            override fun onFailure(call: Call<Wrapper>, t: Throwable) {
                println(t.localizedMessage)
            }
            override fun onResponse(call: Call<Wrapper>, response: Response<Wrapper>) {
                println("SUCCESS POST : $response")
            }
        })
    }

}