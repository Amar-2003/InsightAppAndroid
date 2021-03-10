package com.example.insights

import android.app.Dialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View


class MainActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        @Suppress("DEPRECATION")

        Handler().postDelayed(
            {
                startActivity(Intent(this,LoginPage::class.java))
                finish()
            },
            2500
        )
    }



}