package com.example.advancedsoftwareproject.ui.loginActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.ui.homeActivity.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener {
            println("hhhhhhhh")
            val mainIntent = Intent(this, MainActivity::class.java)
            this.startActivity(mainIntent)
            this.finish()
        }
    }
}