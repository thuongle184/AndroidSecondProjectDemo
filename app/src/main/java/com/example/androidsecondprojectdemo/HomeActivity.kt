package com.example.androidsecondprojectdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        txt_back.setOnClickListener {
            finish()
        }

        val userInform = intent

        val strUser: String = userInform.getStringExtra("Username")
        val strPassword: String = userInform.getStringExtra("Password")

        show_username.text =  strUser
        show_password.text = strPassword
    }
}
