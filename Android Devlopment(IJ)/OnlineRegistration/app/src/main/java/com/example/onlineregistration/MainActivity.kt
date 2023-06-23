package com.example.admissionform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.example.onlineregistration.R
import com.example.onlineregistration.RegistrationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.lets_begin)
        buttonClick.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

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