package com.example.simple_kotlin_retrofit.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.simple_kotlin_retrofit.config.RetrofitBuilder

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */

class ProductViewModel : ViewModel(){

    private val productRepository:ProductRepository

    init {
        val productAPI = RetrofitBuilder.createRetrofit().create(ProductAPI::class.java)
        productRepository = ProductRepository(productAPI)
    }

    val product:LiveData<Product> = productRepository.product

    fun getProductById(id:String){
        productRepository.getProduct(id)
    }

    fun createProduct(product: Product){
        productRepository.createProduct(product)
    }
}