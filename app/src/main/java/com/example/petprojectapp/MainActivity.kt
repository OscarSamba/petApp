package com.example.petprojectapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var start = findViewById<Button>(R.id.tvButton)

        start.setOnClickListener {
          val Intent = Intent( this, MainActivity2::class.java)
            startActivity(Intent)

        }
    }
}