package com.example.sampleui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

class ConfirmPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.confirm_password)

        val btnConfirmPass = findViewById<View>(R.id.btn_confirm_pass) as Button

        btnConfirmPass.setOnClickListener { Toast.makeText(this@ConfirmPassword, "Password Changed!", Toast.LENGTH_SHORT).show() }

    }
}
