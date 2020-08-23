package com.example.simple_kotlin_retrofit.product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

import com.example.simple_kotlin_retrofit.R
import kotlinx.android.synthetic.main.fragment_create_product.*

class CreateProductFragment : Fragment(),View.OnClickListener {

    val productViewModel by activityViewModels<ProductViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnSubmitProduct.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0){
            btnSubmitProduct -> {
                val menuName = etMenuName.text.toString()
                val price = etPrice.text.toString().toInt()
                val stock = etStock.text.toString().toInt()
                val product = Product(menuName = menuName,price = price,stock = stock,category = Category(categoryId = "4710ea16-c006-11ea-abf0-784561ed131e"))
                productViewModel.createProduct(product)
            }
        }
    }
}
