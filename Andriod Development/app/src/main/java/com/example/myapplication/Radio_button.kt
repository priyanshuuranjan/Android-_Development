package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.*

class Radio_button : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)


        var radio=findViewById<RadioGroup>(R.id.Rgrp)
        var submit=findViewById<Button>(R.id.button7)
        var txtView=findViewById<TextView>(R.id.textView3)
        submit.setOnClickListener {
            val selectId:Int = radio.checkedRadioButtonId
            var radioButton = findViewById<Button>(selectId)
            var out:String = radioButton.text.toString()
            txtView.text = "Selected: $out "


        }

        radio.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, " On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
// radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )
    }
}