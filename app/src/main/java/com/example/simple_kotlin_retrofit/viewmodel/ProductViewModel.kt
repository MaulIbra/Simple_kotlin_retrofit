package com.example.simple_kotlin_retrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.simple_kotlin_retrofit.model.Product
import com.example.simple_kotlin_retrofit.repository.ProductRepository
import javax.inject.Inject

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */

class ProductViewModel @Inject constructor(private val productRepository: ProductRepository) : ViewModel(){

    val product:LiveData<Product> = productRepository.product

    fun getProductById(id:String){
        productRepository.getProduct(id)
    }

    fun createProduct(product: Product){
        productRepository.createProduct(product)
    }
}