package com.example.admissionform.classes

import android.os.Parcel
import android.os.Parcelable

class RegistrationDetails(
    var name: String?,
    var address: String?,
    var gender: String?,
    var dob: String?,
    var email: String?,
    var phone: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun toString(): String {
        return "<b>Name:</b>  $name<br/><b>Address:</b>  $address<br/><b>Gender:</b>  $gender<br/><b>Date of birth:</b> $dob<br/><b>Email:</b>  $email<br/><b>Phone:</b>  $phone"
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeString(name)
        parcel.writeString(address)
        parcel.writeString(gender)
        parcel.writeString(dob)
        parcel.writeString(email)
        parcel.writeString(phone)
    }

    companion object CREATOR : Parcelable.Creator<RegistrationDetails> {
        override fun createFromParcel(parcel: Parcel): RegistrationDetails {
            return RegistrationDetails(parcel)
        }

        override fun newArray(size: Int): Array<RegistrationDetails?> {
            return arrayOfNulls(size)
        }
    }
}