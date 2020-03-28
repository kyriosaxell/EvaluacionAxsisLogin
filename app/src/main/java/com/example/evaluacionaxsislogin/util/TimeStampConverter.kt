package com.example.evaluacionaxsislogin.util

import androidx.room.TypeConverter
import java.util.*

public class TimeStampConverter {
    object Converters {
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