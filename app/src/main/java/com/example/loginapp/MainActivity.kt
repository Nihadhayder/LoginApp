package com.example.loginapp

import android.net.wifi.hotspot2.pps.Credential
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var username :EditText
    lateinit var password :EditText
    lateinit var login :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput =findViewById(R.id.username_input)
        passwordInput =findViewById(R.id.password_input)
        loginButton =findViewById(R.id.login_button)

        loginbutton.setOnClickListener{it:view
        val username = usernameInput.text.toString()
            val password =passwordInput.text.toString()
            log.i(tag:"Test Credentials",msg:"Username : $username and password : $password")
        }
    }
}