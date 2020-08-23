package com.example.simple_kotlin_retrofit.product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer

import com.example.simple_kotlin_retrofit.R
import kotlinx.android.synthetic.main.fragment_product.*

class ProductFragment : Fragment(),View.OnClickListener {
    private val productViewModel by activityViewModels<ProductViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnSearch.setOnClickListener(this)
        productViewModel.product.observe(viewLifecycleOwner, Observer {
            tvResult.text = it.menuName
        })
    }

    override fun onClick(p0: View?) {
        when(p0){
            btnSearch -> search()
        }
    }

    private fun search() {
        productViewModel.getProductById(etId.text.toString())
    }


}
