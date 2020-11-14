package com.example.signupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker

class BirthdateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdate)

        findViewById<Button>(R.id.btnSignUp).setOnClickListener{signUp()}
    }
    private fun signUp() {

        val firstname = intent.getStringExtra("FirstName").toString()
        val lastname =intent.getStringExtra("LastName").toString()
        val email =intent.getStringExtra("EmailAdd").toString()
        val age =intent.getStringExtra("Age").toString()
        val number = intent.getStringExtra("Number").toString()

        val intent = Intent(this,DisplayActivity::class.java)

        val picker: DatePicker = findViewById<DatePicker>(R.id.dpCalendar) as DatePicker
        var birthdate = "${picker.month}/${picker.dayOfMonth}/${picker.year}"
        picker.init(1999, 10, 28, object: DatePicker.OnDateChangedListener{
            override fun onDateChanged(
                view: DatePicker?,
                year: Int,
                monthOfYear: Int,
                dayOfMonth: Int
            ) {
                birthdate = "${picker.month}/${picker.dayOfMonth}/${picker.year}"
            }
        })

        intent.putExtra("FirstName",firstname)
        intent.putExtra("LastName",lastname)
        intent.putExtra("Email",email)
        intent.putExtra("Age",age)
        intent.putExtra("PhoneNumber",number)
        intent.putExtra("BirthDate",birthdate)

        startActivity(intent)


    }
}