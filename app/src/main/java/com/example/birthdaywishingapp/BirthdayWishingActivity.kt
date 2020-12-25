package com.example.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayWishingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wishing)
        var name = intent.getStringExtra("name")
        val resulttv = findViewById<TextView>(R.id.textView)
        resulttv.text = "Happy Birthday \n $name!"
    }
}