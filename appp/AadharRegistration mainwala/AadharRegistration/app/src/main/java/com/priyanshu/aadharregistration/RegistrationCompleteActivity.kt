package com.priyanshu.aadharregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Html.FROM_HTML_MODE_LEGACY
import android.widget.TextView
import com.priyanshu.aadharregistration.classes.AadhaarDetails

class RegistrationCompleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_complete)

        val bundle = intent.extras
        if (bundle != null){
            val aadhaarDetails = bundle.getParcelable<AadhaarDetails>("aadhaarDetails")
            val textView: TextView = findViewById(R.id.details)
            textView.text = Html.fromHtml(aadhaarDetails.toString(), FROM_HTML_MODE_LEGACY)
        }
    }
}