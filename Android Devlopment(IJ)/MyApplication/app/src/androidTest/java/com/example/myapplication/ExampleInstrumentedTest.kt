package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class cityWeather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
//        window.decorView.windowInsetsController = view
        supportActionBar?.hide()
        setContentView(R.layout.activity_city_weather)
        var deg = findViewById<TextView>(R.id.textView)
        var ct = findViewById<TextView>(R.id.textView2)
        var weather = findViewById<TextView>(R.id.textView4)
        var wind = findViewById<TextView>(R.id.textView5)
        var pre = findViewById<TextView>(R.id.textView7)
        var humid = findViewById<TextView>(R.id.textView9)
        var w= arrayOf("Sunny","Clear","Cloudy","Rainy","Windy")
        var city = intent.getStringExtra("city")
        ct.text = city
        deg.text = Random.nextInt(15,40).toString() + " ℃"
//        if(deg.text.toString().toInt() <= 15){
//            weather.text = "Cloudy"
//        }
//        if(deg.text.toString().toInt() <= 22){
//            weather.text = "Rainy"
//        }
//        if(deg.text.toString().toInt() <= 28){
//            weather.text = "Windy"
//        }
//        else{
//
//        }
        weather.text = w.random()
        wind.text = Random.nextInt(60,85).toString()
        pre.text = Random.nextInt(50,60).toString()
        humid.text = Random.nextInt(60,90).toString()

    }
}
package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
//        window.decorView.windowInsetsController = view
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)
        var city = findViewById<EditText>(R.id.city)
        var search = findViewById<Button>(R.id.button)

        search.setOnClickListener{
            intent = Intent(applicationContext,cityWeather::class.java)
            intent.putExtra("city",city.text.toString())
            startActivity(intent)
        }

    }
}

