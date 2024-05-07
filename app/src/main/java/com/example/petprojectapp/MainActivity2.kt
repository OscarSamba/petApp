package com.example.petprojectapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val feed = findViewById<Button>(R.id.FButton)
        val clean = findViewById<Button>(R.id.CButton)
        val  play = findViewById<Button>(R.id.PButton)
        val hunger = findViewById<TextView>(R.id.TextView)
        val Clean = findViewById<TextView>(R.id.Clean)
        val Happy = findViewById<TextView>(R.id.Happy)
        val image = findViewById<ImageView>(R.id.imageView5)
        val Hunger2 = findViewById<TextView>(R.id.Hunger2)
        val Clean2 = findViewById<TextView>(R.id.Clean2)
        val Happy2 = findViewById<TextView>(R.id.Happy)

        feed.setOnClickListener {
            hunger.text = "Happy"
            image.setImageDrawable(getDrawable(R.drawable.img_5))

            clean.setOnClickListener {
                clean.text = "Clean"
                image.setImageDrawable(getDrawable(R.drawable.img_4))

                play.setOnClickListener {
                    Happy.text = "Happy"
                    image.setImageDrawable(getDrawable(R.drawable.img_3))

                }

            }

        }
    }
}