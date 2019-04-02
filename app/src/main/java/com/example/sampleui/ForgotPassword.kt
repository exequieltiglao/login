package com.example.sampleui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class ForgotPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password)

        val btnSend = findViewById<View>(R.id.btn_send) as Button

        btnSend.setOnClickListener {
            val intent = Intent(this@ForgotPassword, ConfirmPassword::class.java)
            startActivity(intent)
        }

    }
}
