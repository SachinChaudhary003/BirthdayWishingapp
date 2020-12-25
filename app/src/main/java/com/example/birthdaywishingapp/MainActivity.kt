package com.example.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createcard(view: View) {
        val nameet = findViewById<EditText>(R.id.nameinput)
        val name = nameet.text.toString()
        val intent = Intent(this , BirthdayWishingActivity::class.java)
        intent.putExtra("name" , name)
        startActivity(intent)

    }
}