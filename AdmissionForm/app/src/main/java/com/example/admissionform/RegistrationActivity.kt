package com.example.admissionform

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.InputType
import android.widget.AutoCompleteTextView
import android.widget.Toast
import com.example.admissionform.classes.RegistrationDetails
import com.google.android.material.button.MaterialButton
import com.google.android.material.checkbox.MaterialCheckBox
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointBackward
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.TextInputEditText
import java.text.SimpleDateFormat
import java.util.*

class RegistrationActivity : AppCompatActivity() {
    private var dob: TextInputEditText? = null
    private var name: TextInputEditText? = null
    private var house: TextInputEditText? = null
    private var city: TextInputEditText? = null
    private var pincode: TextInputEditText? = null
    private var email: TextInputEditText? = null
    private var phone: TextInputEditText? = null

    private var gender: AutoCompleteTextView? = null
    private var state: AutoCompleteTextView? = null

    private var check: MaterialCheckBox? = null;

    private var mProgressDialog: ProgressDialog? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        dob = findViewById(R.id.d_o_b)
        name = findViewById(R.id.name)
        house = findViewById(R.id.house)
        city = findViewById(R.id.city)
        pincode = findViewById(R.id.pincode)
        email = findViewById(R.id.email)
        phone = findViewById(R.id.phone)
        gender = findViewById(R.id.gender)
        state = findViewById(R.id.state)
        check = findViewById(R.id.check)

        mProgressDialog = ProgressDialog(this);
        mProgressDialog?.setMessage("Please wait...")

        val constraintsBuilder =
            CalendarConstraints.Builder()
                .setValidator(DateValidatorPointBackward.now())
        val materialDatePicker = MaterialDatePicker.Builder
            .datePicker()
            .setTitleText("Select date of birth")
            .setCalendarConstraints(constraintsBuilder.build())
            .build()

        dob?.setRawInputType(InputType.TYPE_NULL)

        dob?.setOnFocusChangeListener { _, focus ->
            if(focus)
                materialDatePicker.show(supportFragmentManager, "DATE_PICKER") }
        dob?.setOnClickListener{
            materialDatePicker.show(supportFragmentManager, "DATE_PICKER")
        }
        materialDatePicker.addOnPositiveButtonClickListener{
            val dateFormatter = SimpleDateFormat("dd-MM-yyyy")
            val date = dateFormatter.format(Date(it))
            dob?.setText(date)
        }
        findViewById<MaterialButton>(R.id.save).setOnClickListener{
            save()
        }
    }
    private fun validate(): Boolean {
        var valid = true;
        if(name?.text.isNullOrBlank()) {
            valid = false;
        }
        if(gender?.text.isNullOrBlank()) {
            valid = false;
        }
        if(dob?.text.isNullOrBlank()) {
            valid = false;
        }
        if(house?.text.isNullOrBlank()) {
            valid = false;
        }
        if(city?.text.isNullOrBlank()) {
            valid = false;
        }
        if(state?.text.isNullOrBlank()) {
            valid = false;
        }
        if(pincode?.text.isNullOrBlank()) {
            valid = false;
        }
        if(email?.text.isNullOrBlank()) {
            valid = false;
        }
        if(phone?.text.isNullOrBlank()) {
            valid = false;
        }
        if(check?.isChecked == false) {
            valid = false;
        }
        return valid;
    }
    private fun save() {
        if(!validate()) {
            Toast.makeText(this, "Please provide input for all fields", Toast.LENGTH_SHORT).show()
            return
        }
        var registrationDetails = RegistrationDetails(
            name?.text.toString(),
            house?.text.toString() + ", " + city?.text.toString() + ", " + state?.text.toString() + ", " + pincode?.text.toString(),
            gender?.text.toString(),
            dob?.text.toString(),
            email?.text.toString(),
            phone?.text.toString()
        )
        mProgressDialog?.show()
        Handler().postDelayed({
            mProgressDialog?.hide()
            val bundle = Bundle()
            bundle.putParcelable("registrationDetails", registrationDetails)
            val intent = Intent(this, RegistrationCompleteActivity::class.java)
            intent.putExtras(bundle)
            print(registrationDetails)
            startActivity(intent)
        }, 2000)
    }
}