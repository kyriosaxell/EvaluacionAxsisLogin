package com.example.evaluacionaxsislogin.data

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.evaluacionaxsislogin.data.model.Usuario
import com.example.evaluacionaxsislogin.data.model.UsuarioDao
import com.example.evaluacionaxsislogin.db.UsuarioRoomDataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class UsuarioRepository(application: Application) {
    //
    private var usuarioDao: UsuarioDao? = null

    init {
        val db = UsuarioRoomDataBase.getDatabase(application)
        usuarioDao = db.usuarioDao()
    }

    fun getAllUsers() = usuarioDao?.getAllUsuarios()

    suspend fun newUsuario(usuario: Usuario) = usuarioDao?.insertarUsuario(usuario)

    suspend fun updateUsuario(
        id: Long,
        email: String,
        user: String,
        sexo: String,
        contrasena: String
    ) {
        usuarioDao?.updateUser(id, email, user, sexo, contrasena)
    }

    suspend fun updateEstatus(id: Long, estatus: Int) {
        usuarioDao?.updateEstatus(id, estatus)
    }
}