package com.example.simple_kotlin_retrofit.di

import android.app.Application

/**
 * Created by Maulana Ibrahim on 25/August/2020
 * Email maulibrahim19@gmail.com
 */
class MyApplication:Application() {
    val applicationComponent: ApplicationComponent = DaggerApplicationComponent.create()
}