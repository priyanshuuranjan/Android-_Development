package com.example.allregistration
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Address : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)
        val houseNum = findViewById<EditText>(R.id.houseNumber)
        val houseName = findViewById<EditText>(R.id.houseName)
        val street = findViewById<EditText>(R.id.street)
        val town = findViewById<EditText>(R.id.town)
        val post = findViewById<EditText>(R.id.post)
        val pin = findViewById<EditText>(R.id.pinCode)
        val btn1 = findViewById<Button>(R.id.next1)


        btn1.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Please Confirm")
                .setMessage("HOUSE NUMBER = ${houseNum.text} \n " +
                        "HOUSE NAME = ${houseName.text} \n " +
                        "STREET = ${street.text}\n" +
                        "TOWN = ${town.text}\n" +
                        "POST = ${post.text}\n" +
                        "PIN-CODE = ${pin.text}")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_info)

            builder.setPositiveButton("Yes"){
                    dialogInterface, which -> startActivity(Intent(applicationContext,ParentsDetail::class.java))
            }
            builder.setNeutralButton("Cancel"){
                    dialogInterface , which ->
                Toast.makeText(this,"CANCELED", Toast.LENGTH_LONG).show()
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