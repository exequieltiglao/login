package com.example.sampleui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnForgotPw = findViewById<View>(R.id.btn_forgot_password) as Button

        btnForgotPw.setOnClickListener {
            val intent = Intent(this@MainActivity, ForgotPassword::class.java)
            startActivity(intent)
        }
    }
}
