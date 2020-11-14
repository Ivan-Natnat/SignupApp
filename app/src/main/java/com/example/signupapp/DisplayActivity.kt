package com.example.signupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val tvFirstName = findViewById<TextView>(R.id.tvInputFirstName)
        val tvAge = findViewById<TextView>(R.id.tvInputAge)
        val firstName = intent.getStringExtra("FirstName")
        val age= intent.getStringExtra("Age")
        tvFirstName.text = "First Name: " + firstName
        tvAge.text =age
    }
}