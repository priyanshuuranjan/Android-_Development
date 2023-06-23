package com.example.onlineregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Home -> {
                Toast.makeText(this, "You Were already in home page", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.about -> {
                Toast.makeText(this, "V1.0.12", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.exit -> {
                finish()
                return true

            }
        }
        return super.onOptionsItemSelected(item)
    }
}