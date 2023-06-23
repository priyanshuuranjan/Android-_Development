package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        var players = arrayOf("Rohit", "Dhoni", "Sachin")
        val spinner=findViewById<Spinner>(R.id.spinner)
        val arrayAdapter=ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,players)
        spinner.adapter= arrayAdapter as SpinnerAdapter?
        spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext," Your selected player is " +players[p2],Toast.LENGTH_SHORT).show()

            }
override fun onNothingSelected(parent:AdapterView<*>){

}
        }

    }

    private fun <T> ArrayAdapter(spinner: spinner, simpleSpinnerDropdownItem: Int, players: Array<T>) {

    }
}