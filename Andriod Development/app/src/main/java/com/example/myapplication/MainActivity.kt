package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txt = findViewById<TextView>(R.id.editTextTextPersonName)
        var txt1 = findViewById<TextView>(R.id.editTextTextPersonName2)
        var txt2 = findViewById<TextView>(R.id.editTextTextPersonName3)
        var txt3 = findViewById<TextView>(R.id.editTextTextPersonName4)
        var btn= findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            if(txt.text.isEmpty()|| txt1.text.isEmpty()|| txt2.text.isEmpty()||txt3.text.isEmpty()){
                Toast.makeText(this,"Please Fill the form properly",Toast.LENGTH_LONG).show()
            }else{
                Snackbar.make(it,"Your Data were Saved!! Thank You",Snackbar.LENGTH_LONG).show()
            }
        }
    }
}