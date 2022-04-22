package com.example.orderapps

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_order.*
import java.util.regex.Pattern


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Email Patterninin oluşması
        var emailPattern = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "yalova.edu" +
                "(" +
                "\\." +
                "tr" +
                ")+"

        //Button ile gerekli kontrolleri yapıp diğer sayfaya geçiş sağlama
        btn_kayitOl.setOnClickListener {
            //Adın girileceği yerin dolu yada boş mu kontrol edilmesi
            if (edt_name.text.toString().length > 2) {
                //Soyadın girileceği yerin dolu yada boş mu kontrol edilmesi
                if (edt_surname.text.toString().length > 2) {
                    // Email Adresin kontrolü
                    if (edt_email.text.toString().trim { it <= ' ' }
                            .matches(emailPattern.toRegex())) {
                        // Şifrenin Kontrolü
                        if (edt_password.text.toString().length >= 8) {
                            // Checkbox ın kontrolü
                            if (checkBox_kvkk.isChecked) {
                                //Ad ve Soyadın diğer sayfaya aktarımı
                                val name = edt_name.text.toString()
                                val surname = edt_surname.text.toString()
                                val email = edt_email.text.toString()
                                val newIntent = Intent(this@MainActivity, OrderActivity::class.java)

                                newIntent.putExtra("name", name)
                                newIntent.putExtra("surname", surname)
                                newIntent.putExtra("email", email)
                                startActivity(newIntent)
                            } else {
                                Toast.makeText(
                                    this,
                                    "KVKK Metnini Okuyunuz ve Onaylayınız...",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        } else {
                            Toast.makeText(
                                applicationContext,
                                "Şifreniz 8 Karakterden Az Olmamalı...",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "Geçersiz Email Adresi...",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(applicationContext, "Soyisminizi Giriniz...", Toast.LENGTH_SHORT)
                        .show()
                }
            }else{
                Toast.makeText(applicationContext, "İsminizi Giriniz...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}



