package com.newapp.firstappsai.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.newapp.firstappsai.R

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val email_et = findViewById<EditText>(R.id.email_lp)
        val password_et = findViewById<EditText>(R.id.password_lp)
        val loginButton = findViewById<Button>(R.id.login_lp)


        loginButton.setOnClickListener {
            var email = email_et.text
            var password_et = password_et.text
            Log.e("email",""+email)
            Log.e("password",""+password_et)

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)





        }





    }
}