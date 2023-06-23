package com.example.allregistration
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val surName = findViewById<EditText>(R.id.surName)
        val firstName = findViewById<EditText>(R.id.firstName)
        val dob = findViewById<EditText>(R.id.DOB)
        val rGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val btn = findViewById<Button>(R.id.next)

        btn.setOnClickListener{
            val selectId:Int = rGroup.checkedRadioButtonId
            var radioButton = findViewById<Button>(selectId)
            var gender:String = radioButton.text.toString()
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Please Confirm")
                .setMessage("FIRST NAME = ${firstName.text.toString()} \n SURNAME = ${surName.text.toString()} \n Date Of Birth = ${dob.text.toString()}\n GENDER = $gender")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_info)

            builder.setPositiveButton("Yes"){
                    dialogInterface, which -> startActivity(Intent(applicationContext,Address::class.java))
            }
            builder.setNeutralButton("Cancel"){
                    dialogInterface , which ->
                Toast.makeText(this,"CANCELED",Toast.LENGTH_LONG).show()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.setting -> {
                Toast.makeText(this, "setting", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.gallery -> {
                Toast.makeText(this, "Gallery", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.about -> {
                Toast.makeText(this, "Gallery", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.exit -> {
                finish()
                return true
            }
        }
        return true
    }
}