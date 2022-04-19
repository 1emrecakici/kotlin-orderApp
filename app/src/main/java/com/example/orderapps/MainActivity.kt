package com.example.orderapps

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_order.*
import java.util.regex.Pattern


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailPattern = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "yalova.edu" +
                "(" +
                "\\." +
                "tr" +
                ")+"

        btn_kayitOl.setOnClickListener {
            // Check Email Adress
            if (edt_email.text.toString().trim { it <= ' ' }.matches(emailPattern.toRegex())) {
                // Check Password
                if (edt_password.text.toString().length >= 8) {
                    //Check Checkbox Click
                    if(checkBox_kvkk.isChecked){
                        val name = edt_name.text.toString()
                        val surname = edt_surname.text.toString()
                        val email = edt_email.text.toString()
                        val newIntent = Intent(this@MainActivity,OrderActivity::class.java)

                        newIntent.putExtra("name",name)
                        newIntent.putExtra("surname", surname)
                        newIntent.putExtra("email",email)
                        startActivity(newIntent)
                    }
                    else {
                        Toast.makeText(this, "Please check KVKK Clarification Text.", Toast.LENGTH_LONG).show()
                    }
                } else{
                    Toast.makeText(applicationContext, "Your password must be more 8 characters", Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(applicationContext, "Invalid email address", Toast.LENGTH_SHORT).show()
            }
            }

        }


    }



