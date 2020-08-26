package com.example.simple_kotlin_retrofit.model

import com.example.simple_kotlin_retrofit.model.Category
import com.google.gson.annotations.SerializedName

/**
 * Created by Maulana Ibrahim on 22/August/2020
 * Email maulibrahim19@gmail.com
 */
class Product(
    var menuId: String = "",
    var menuName: String = "",
    var stock: Int = 0,
    var price: Int = 0,
    var menuActive: Int = 1,
    @SerializedName("jenis")
    var category: Category
)