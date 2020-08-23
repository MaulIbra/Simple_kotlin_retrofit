package com.example.simple_kotlin_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
