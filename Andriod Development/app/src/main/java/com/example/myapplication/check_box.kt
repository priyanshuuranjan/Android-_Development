package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class check_box : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        var coffee = findViewById<CheckBox>(R.id.checkBox)
        var rice = findViewById<CheckBox>(R.id.checkBox2)
        var shake = findViewById<CheckBox>(R.id.checkBox3)
        var pizza = findViewById<CheckBox>(R.id.checkBox4)
        var burger = findViewById<CheckBox>(R.id.checkBox5)
        var buy = findViewById<Button>(R.id.button8)

        buy.setOnClickListener(){
            var result = StringBuilder()
            var total = 0
            if (coffee.isChecked){
                result.append("Coffee \t Rs. 80")
                total += 80
            }
            if (rice.isChecked){
                result.append("\nTea \t Rs. 20")
                total += 20
            }
            if(shake.isChecked){
                result.append("\nShake \t Rs. 50")
                total += 50
            }
            if (pizza.isChecked){
                result.append("\nPizza \t Rs. 250")
                total += 250
            }
            if (burger.isChecked){
                result.append("\nBurger \t Rs. 60")
                total += 60
            }
            Toast.makeText(applicationContext,"$result \n\n Total payable:- $total",Toast.LENGTH_LONG).show()
        }
    }
}