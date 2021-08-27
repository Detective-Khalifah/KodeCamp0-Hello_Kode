package com.blogspot.thengnet.hellokode

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetButton: Button = findViewById(R.id.sayGreeting)
        val birthdayGreeting: TextView = findViewById(R.id.bGreeting)
        greetButton.setOnClickListener {
            birthdayGreeting.text = "Happy Birthday!"
            birthdayGreeting.visibility = View.VISIBLE
        }
    }

}