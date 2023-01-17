package com.himanshu.navcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("hp" ,"oncreate")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.fragmentContainerView)
        val bottomView = findViewById<BottomNavigationView>(R.id.bottomBar)
        NavigationUI.setupWithNavController(bottomView,navController)

//        homeFragment().onAttach(this) // object without name







//        supportActionBar?.title = "HP"

    }
    public fun actionTitle(actionTitle : String)
    {
        supportActionBar?.title = actionTitle
    }

}