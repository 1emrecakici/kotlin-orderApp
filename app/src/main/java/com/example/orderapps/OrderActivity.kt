package com.example.orderapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        val email = intent.getStringExtra("email")

        profileFullName.text = name+" "+surname
        profileUserEmail.text = email

        Glide.with(this)
            .load("https://previews.123rf.com/images/triken/triken1608/triken160800029/61320775-male-avatar-profile-picture-default-user-avatar-guest-avatar-simply-human-head-vector-illustration-i.jpg")
            .centerCrop()
            .into(profile_image)



    }
}