package com.example.customalertdialog
import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSimpleAlert = findViewById<Button>(R.id.btnSimpleAlert)
        val btnAlertWithItems = findViewById<Button>(R.id.btnAlertWithItems)

        btnSimpleAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Simple Alert")
                .setMessage("This iS Simple alert")
                .setPositiveButton("OK") { dialog, which ->
                    Toast.makeText(applicationContext, "You Click Okk!", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("No") { dialog, which ->
                    Toast.makeText(applicationContext, "You Clicked nO Button", Toast.LENGTH_SHORT).show()
                }
                .setCancelable(false)
                .show()
        }

        btnAlertWithItems.setOnClickListener {
            val items = arrayOf("Apple", "Cars", "Bullet", "MotorCycle")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("List of Items")
                .setItems(items) { dialog, which ->
                    Toast.makeText(
                        applicationContext,
                        items[which] + " is clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .setPositiveButton("OK", null)
                .setNegativeButton("CANCEL", null)



        val alertDialog = builder.create()
            alertDialog.show()
        val button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
        val buttonN = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)
        button.setBackgroundColor(Color.BLUE)
        button.setTextColor(Color.WHITE)
    buttonN.setTextColor(Color.BLUE)
        }
    }}


































