package com.newapp.firstappsai.activities

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.newapp.firstappsai.R

class SignUpActivity2 : AppCompatActivity() {
    lateinit var userName_et: EditText
    lateinit var phone_et: EditText
    lateinit var email_et: EditText
    lateinit var password_et: EditText
    lateinit var signUpButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)

        userName_et = findViewById<EditText>(R.id.name_signup)
        phone_et = findViewById<EditText>(R.id.phoneSignup)
        email_et = findViewById<EditText>(R.id.emailSignup)
        password_et = findViewById<EditText>(R.id.passwordSignup)
        signUpButton = findViewById<Button>(R.id.buttonSignup)


            signUpButton.setOnClickListener {
           //checking validation
            val value = validation()
            if(value){ //here true/false will come

                //sharedpreferences
                val sharedPreferences: SharedPreferences = this.getSharedPreferences("USER_CRED", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor =  sharedPreferences.edit()

                //key values
                editor.putString("USER_NAME", userName_et.text.toString())
                editor.putString("PHONE", phone_et.text.toString())
                editor.putString("EMAIL", email_et.text.toString())
                editor.putString("PASSWORD",password_et.text.toString())
                editor.apply()
                editor.commit()

                var userName = sharedPreferences.getString("USER_NAME","")

            }
        }

//field.text.toString().length >= 6
    }

    private fun validation():Boolean {
        if(userName_et.text.length==0){
            Toast.makeText(this, "Enter User Name", Toast.LENGTH_SHORT).show()
            return false
        }
        if(phone_et.text.length==0){
            Toast.makeText(this, "Enter Phone No.", Toast.LENGTH_SHORT).show()
            return false
        }
        if(email_et.text.length==0){
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show()
            return false
        }
        if(password_et.text.length==0){
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show()
            return false
        }

        return true

    }
}