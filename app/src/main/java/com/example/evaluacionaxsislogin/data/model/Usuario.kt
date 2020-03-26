package com.example.evaluacionaxsislogin.data.model

import androidx.room.*
import com.example.evaluacionaxsislogin.util.Encryption
import java.util.*

@Entity(tableName = "tcusuarios")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val email: String,
    val user: String,
    @TypeConverters(Encryption.Converter::class)
    val contrasena: String?,
    val estatus: Boolean,
    val sexo: String,
    val fecha_creacion: Calendar = Calendar.getInstance()
)