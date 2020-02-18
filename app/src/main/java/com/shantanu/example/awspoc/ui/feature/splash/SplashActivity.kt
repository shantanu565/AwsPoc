package com.shantanu.example.awspoc.ui.feature.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shantanu.example.awspoc.R
import com.shantanu.example.awspoc.ui.feature.home.HomeActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        intent = Intent(applicationContext, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
