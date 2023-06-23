package com.example.admissionform

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.admissionform.classes.RegistrationDetails

class RegistrationCompleteActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_complete)

        val bundle = intent.extras
        if (bundle != null){
            val registrationDetails = bundle.getParcelable<RegistrationDetails>("aadhaarDetails")
            val textView: TextView = findViewById(R.id.details)
            textView.text = Html.fromHtml(registrationDetails.toString(), Html.FROM_HTML_MODE_LEGACY)
        }
    }
}