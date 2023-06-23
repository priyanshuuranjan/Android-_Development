package com.priyanshu.aadharregistration.classes

import android.os.Parcel
import android.os.Parcelable

class AadhaarDetails(
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

    companion object CREATOR : Parcelable.Creator<AadhaarDetails> {
        override fun createFromParcel(parcel: Parcel): AadhaarDetails {
            return AadhaarDetails(parcel)
        }

        override fun newArray(size: Int): Array<AadhaarDetails?> {
            return arrayOfNulls(size)
        }
    }
}