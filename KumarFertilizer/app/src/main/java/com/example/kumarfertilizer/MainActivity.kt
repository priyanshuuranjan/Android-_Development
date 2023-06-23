package com.example.kumarfertilizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<Button>(R.id.lets_begin)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Shop_Details::class.java)
            startActivity(intent)
        }
    }
}