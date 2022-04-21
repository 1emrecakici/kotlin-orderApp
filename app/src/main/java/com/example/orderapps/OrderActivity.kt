package com.example.orderapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        var sum: Int = 0
        var sum1:Int = 0
        var sum2:Int = 0

        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        val email = intent.getStringExtra("email")

        profileFullName.text ="HOŞGELDİNİZ"+" "+name+" "+surname
        profileUserEmail.text = email

        Glide.with(this)
            .load("https://previews.123rf.com/images/triken/triken1608/triken160800029/61320775-male-avatar-profile-picture-default-user-avatar-guest-avatar-simply-human-head-vector-illustration-i.jpg")
            .centerCrop()
            .into(profile_image)

        sum_txtview.setVisibility(View.INVISIBLE)

        rgrup_iskender.setOnCheckedChangeListener{iskender, checkedId ->
            if (checkedId == R.id.iskender10 || checkedId == R.id.iskender20 || checkedId == R.id.iskender30){
                if (checkedId == R.id.iskender10){
                    sum1 = sum + 10
                }
                if (checkedId == R.id.iskender20){
                    sum1 = sum + 20
                }
                if (checkedId == R.id.iskender30){
                    sum1 = sum + 30
                }
            }
        }
        rgrup_kebap.setOnCheckedChangeListener{kebap, checkedId ->
            if (checkedId == R.id.kebap10 || checkedId == R.id.kebap20 || checkedId == R.id.kebap30){
                if (checkedId == R.id.kebap10){
                    sum2 = sum + 10
                }
                if (checkedId == R.id.kebap20){
                    sum2 = sum + 20
                }
                if(checkedId == R.id.kebap30){
                    sum2 = sum + 30
                }
            }
        }

        sum_button.setOnClickListener{
            if (sum1 == 0 || sum2 ==0){
                if (sum1 == 0){
                    Toast.makeText(this, "İskender menüsünden seçim yapınız...", Toast.LENGTH_SHORT).show()
                    sum_txtview.setVisibility(View.INVISIBLE)
                }
                if(sum2 == 0){
                    Toast.makeText(this, "Kebap menüsünden seçim yapınız...", Toast.LENGTH_SHORT).show()
                    sum_txtview.setVisibility(View.INVISIBLE)
                }
            } else {
                sum = sum1 + sum2
                sum_txtview.setVisibility(View.VISIBLE)
                sum_txtview.text = sum.toString()+" "+"TL"
                rgrup_iskender.clearCheck()
                rgrup_kebap.clearCheck()
                sum = 0
                sum1 = 0
                sum2 = 0
            }



        }


    }
}