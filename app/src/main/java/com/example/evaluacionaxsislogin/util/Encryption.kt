package com.example.evaluacionaxsislogin.util

import android.util.Log
import androidx.room.TypeConverter

class Encryption(var value: String = "") {

    class Converter {
        @TypeConverter
        fun decrypt(encrypted: String): String {
            val ps = EncriptaF.decrypt(encrypted, "SEGURA!_!")
            Log.d("AXELL_E", ps)
            return ps
        }

        @TypeConverter
        fun encrypt(decrypted: String): String {
            val ps = EncriptaF.encrypt(decrypted, "SEGURA!_!")
            Log.d("AXELL_E", ps)
            return ps
        }
    }
}
