package com.example.androidsecondprojectdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_login.setOnClickListener {
            val screen1 = Intent(this@LoginActivity, HomeActivity::class.java)

            val etEmail = findViewById<EditText>(R.id.edit_text_email)
            val etPassword = findViewById<EditText>(R.id.edit_text_password)

            val sentEmail = etEmail.text.toString()
            val sentPassword = etPassword.text.toString()

            screen1.putExtra("Username", sentEmail)
            screen1.putExtra("Password", sentPassword)

            startActivity(screen1)
        }
    }
}
