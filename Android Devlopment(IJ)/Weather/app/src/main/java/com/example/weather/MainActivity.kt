package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var city = arrayOf("Phagwara","Delhi", "Pune" )
        val spinner=findViewById<Spinner>(R.id.spinner)
        val arrayAdapter=
            ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,city)
        spinner.adapter=arrayAdapter
        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (city[p2] == "Delhi"){
                    intent = Intent(applicationContext,Delhi::class.java)
                    startActivity(intent)
                }
                if (city[p2] == "Pune"){
                    intent = Intent(applicationContext,Pune::class.java)
                    startActivity(intent)
                }

            }
            override fun onNothingSelected(parent: AdapterView<*>){
                Toast.makeText(applicationContext," nothing selectd", Toast.LENGTH_SHORT).show()
            }
        }
    }
}