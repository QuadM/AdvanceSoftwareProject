package com.example.advancedsoftwareproject.ui.homeActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.advancedsoftwareproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val navController = Navigation
            .findNavController(this, R.id.fragmentFrame)
        NavigationUI.setupWithNavController(myNavigationBar, navController)
    }

}