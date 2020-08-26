package com.example.simple_kotlin_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.simple_kotlin_retrofit.api.ProductAPI
import com.example.simple_kotlin_retrofit.di.MyApplication
import com.example.simple_kotlin_retrofit.viewmodel.ProductViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    @Inject lateinit var productViewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as MyApplication).applicationComponent.inject(this)

        navController = (nav_host_fragment as NavHostFragment).navController
        NavigationUI.setupWithNavController(bottom_navigation,navController)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.showProduct -> {
                    navController.navigate(R.id.toProductFragment)
                    true
                }
                R.id.createProduct -> {
                    navController.navigate(R.id.toCreateProductFragment)
                    true
                }
                else ->{
                    false
                }
            }
        }
    }
}

