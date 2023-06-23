package com.example.listview
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv = findViewById<ListView>(R.id.lv1)
        val ll = findViewById<LinearLayout>(R.id.ll)

        val a = arrayOf(Color.RED, Color.BLUE, Color.YELLOW, Color.WHITE)
        val b = arrayOf("RED", "BLUE", "YELLOW", "WHITE")
        val ab = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lv.setAdapter(ab)
        lv.setOnItemClickListener { adapterView, view, position, id ->
            ll.setBackgroundColor(a[position])
        }

    }
}