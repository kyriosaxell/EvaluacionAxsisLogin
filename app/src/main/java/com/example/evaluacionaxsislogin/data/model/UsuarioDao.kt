package com.example.evaluacionaxsislogin.data.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM tcusuarios order by fecha_creacion asc")
    fun getAllUsuarios(): LiveData<List<Usuario>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertarUsuario(usuario: Usuario): Long

    @Query("DELETE FROM tcusuarios")
    suspend fun deleteAll()

    @Query("SELECT * FROM tcusuarios WHERE id = :id")
    fun findUsuarioById(id: Long): LiveData<List<Usuario>>

    @Query("UPDATE tcusuarios SET email = :email, user = :user, sexo = :sexo, contrasena = :contrasena where id = :id")
    suspend fun updateUser(id: Long, email: String, user: String, sexo: String, contrasena: String)

    @Query("UPDATE tcusuarios SET estatus = :estatus where id = :id")
    suspend fun updateEstatus(id: Long, estatus: Int)

    @Query("SELECT EXISTS (SELECT 1 FROM tcusuarios WHERE user = :user OR email LIKE :email LIMIT 1) ")
    fun isValidUsuario(user: String, email: String): LiveData<Boolean>


}