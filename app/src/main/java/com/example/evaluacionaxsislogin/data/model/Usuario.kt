package com.example.evaluacionaxsislogin.data.model

import androidx.room.*
import com.example.evaluacionaxsislogin.util.Encryption
import com.example.evaluacionaxsislogin.util.TimeStampConverter
import java.lang.reflect.Constructor
import java.util.*
import kotlin.reflect.KProperty

@Entity(tableName = "tcusuarios")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val email: String,
    val user: String,
    val contrasena: String?,
    val estatus: Boolean,
    val sexo: String,
    val fecha_creacion: Calendar? = null
)
