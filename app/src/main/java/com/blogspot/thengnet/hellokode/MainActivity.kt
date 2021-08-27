package com.blogspot.thengnet.hellokode

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentViewGrp: ConstraintLayout = findViewById(R.id.constraint)

        val greetButton: Button = findViewById(R.id.sayGreeting)
        val birthdayGreeting: TextView = findViewById(R.id.bGreeting)
        val birthdayCard: ImageView = findViewById(R.id.birthdayCard)
        greetButton.setOnClickListener {
            birthdayGreeting.text = "Happy Birthday!"
            birthdayGreeting.visibility = View.VISIBLE

            birthdayCard.visibility = View.VISIBLE

            parentViewGrp.setBackgroundColor(Color.YELLOW)
        }
    }

}