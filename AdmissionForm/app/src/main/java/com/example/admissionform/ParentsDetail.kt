package com.example.admissionform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class ParentsDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parents_detail)
        val mother = findViewById<EditText>(R.id.mother)
        val father = findViewById<EditText>(R.id.father)
        val homeTel = findViewById<EditText>(R.id.homeTele)
        val officeTel = findViewById<EditText>(R.id.office)
        val email = findViewById<EditText>(R.id.email)
        val work = findViewById<EditText>(R.id.work)
        val btn2 = findViewById<Button>(R.id.next2)


        btn2.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Please Confirm")
                .setMessage("MOTHER'S NAME = ${mother.text} \n " +
                        "FATHER'S NAME = ${father.text} \n " +
                        "RESIDENTIAL NUMBER = ${homeTel.text}\n" +
                        "OFFICE NUMBER = ${officeTel.text}\n" +
                        "PARENT'S EMAIL = ${email.text}\n" +
                        "PARENT'S OCCUPATION = ${work.text}")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_info)

            builder.setPositiveButton("Yes"){
                    dialogInterface, which ->
                Snackbar.make(it,"Registeration of your ward has been completed", Snackbar.LENGTH_LONG).setAction("OK") {
                    Toast.makeText(applicationContext, "Thank you", Toast.LENGTH_LONG).show()
                }.show()
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