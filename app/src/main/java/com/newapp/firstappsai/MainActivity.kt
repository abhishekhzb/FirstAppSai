package com.newapp.firstappsai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.login_btn)
        val signUpButton = findViewById<Button>(R.id.signUp_btn)

        //login
        loginButton.setOnClickListener {
                                //current class  , destination class
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        //signup
        signUpButton.setOnClickListener {
            //current class  , destination class
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }


}