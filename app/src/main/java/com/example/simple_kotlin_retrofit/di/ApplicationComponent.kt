package com.example.simple_kotlin_retrofit.di

import com.example.simple_kotlin_retrofit.MainActivity
import com.example.simple_kotlin_retrofit.view.fragment.CreateProductFragment
import com.example.simple_kotlin_retrofit.view.fragment.ProductFragment
import dagger.Component

/**
 * Created by Maulana Ibrahim on 26/August/2020
 * Email maulibrahim19@gmail.com
 */

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(createProductFragment: CreateProductFragment)
    fun inject(productFragment: ProductFragment)
}