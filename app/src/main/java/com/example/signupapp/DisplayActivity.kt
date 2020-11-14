package com.example.signupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        findViewById<TextView>(R.id.FirstName).setText("First Name: ${(intent.getStringExtra("FirstName"))}" )
        findViewById<TextView>(R.id.LastName).setText("Last Name: ${(intent.getStringExtra("LastName"))}" )
        findViewById<TextView>(R.id.Email).setText("Email Address: ${(intent.getStringExtra("Email"))}")
        findViewById<TextView>(R.id.PhoneNumber).setText("Phone Number: ${(intent.getStringExtra("PhoneNumber"))}")
        findViewById<TextView>(R.id.Age).setText("${(intent.getStringExtra("Age"))}")
        findViewById<TextView>(R.id.BirthDate).setText("Birth Date:${(intent.getStringExtra("BirthDate"))}")


    }
}