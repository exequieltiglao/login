package com.example.sampleui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val etUsername = findViewById<View>(R.id.et_username) as EditText
        val etPassword = findViewById<View>(R.id.et_password) as EditText
        val btnForgotPw = findViewById<View>(R.id.btn_forgot_password) as Button
        val btnLogin = findViewById<View>(R.id.btn_login) as Button

        btnForgotPw.setOnClickListener {
            val intent = Intent(this@LoginActivity, ForgotPassword::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            if (et_username.text.toString() == "exequiel"
                    && et_password.text.toString() == "tiglao") {
                Toast.makeText(this, "Login Correct", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
