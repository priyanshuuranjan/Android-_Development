package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class food_order_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_order_details)
        var button=findViewById<Button>(R.id.button2)
        button.setOnClickListener(){
            intent= Intent(this,food_delivery::class.java)
            startActivity(intent)
        }
    }
}