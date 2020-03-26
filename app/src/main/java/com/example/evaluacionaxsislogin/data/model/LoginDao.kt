package com.example.evaluacionaxsislogin.data.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface LoginDao {

    @Query("SELECT ID FROM tcusuarios WHERE email = :email and contrasena = :password")
    fun loginUsuario(email: String, password: String): LiveData<Long>

}

