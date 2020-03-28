package com.example.evaluacionaxsislogin.data

import androidx.room.TypeConverter
import java.util.*

class Converters {
    companion object {
        @TypeConverter
        @JvmStatic
        fun fromTimestamp(value: Long?): Calendar? = value?.let { value ->
            GregorianCalendar().also { calendar ->
                calendar.timeInMillis = value
            }
        }

        @TypeConverter
        @JvmStatic
        fun toTimestamp(timestamp: Calendar?): Long? = timestamp?.timeInMillis
    }


}