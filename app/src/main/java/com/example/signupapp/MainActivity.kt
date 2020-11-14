package com.example.signupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age = findViewById<TextView>(R.id.tvAge)
        val sbAge = findViewById<SeekBar>(R.id.sbAge) as SeekBar
        var startPoint = sbAge.setProgress(18)
        var endPoint = 60

         val firstName = findViewById<EditText>(R.id.edFirstName) as EditText
        val lastName = findViewById<EditText>(R.id.edLastName) as EditText
        val number = findViewById<EditText>(R.id.edNumber) as EditText
        val email = findViewById<EditText>(R.id.edEmail) as EditText

        findViewById<Button>(R.id.btnNext).setOnClickListener{getFirstName()}


        sbAge.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                age.text = "Age: " + progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null ) {
                    startPoint
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null && endPoint == 60){
                    endPoint = seekBar.progress
                }
            }
        })

    }
        private fun getFirstName() {
           val firstName = findViewById<EditText>(R.id.edFirstName) as EditText
            val iage = findViewById<TextView>(R.id.tvAge) as TextView
            val intent = Intent(this,BirthdateActivity::class.java)
            intent.putExtra("Age", iage.text.toString())
            intent.putExtra("FirstName", firstName.text.toString())
            startActivity(intent)
        }


}