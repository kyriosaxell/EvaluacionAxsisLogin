package com.example.evaluacionaxsislogin.ui.usuarios

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.evaluacionaxsislogin.data.UsuarioRepository
import com.example.evaluacionaxsislogin.data.model.Usuario
import com.example.evaluacionaxsislogin.data.model.UsuarioDao
import com.example.evaluacionaxsislogin.db.UsuarioRoomDataBase
import kotlinx.coroutines.*

class UsuarioViewModel(private var repository: UsuarioRepository, application: Application) :
    AndroidViewModel(application) {
    //lista de usuarios
    private val _usuarios = MutableLiveData<List<Usuario>>()
    val lista_usuarios: LiveData<List<Usuario>> = _usuarios

    //
    private val _registroResult = MutableLiveData<RegistroResult>()
    val registro_result: LiveData<RegistroResult> = _registroResult

    //parent coroutine
    private val uiScope = CoroutineScope(Dispatchers.Main + Job())

    //
    private val _usuarioState = MutableLiveData<UsuarioFormState>()
    val usuarioFormState: LiveData<UsuarioFormState> = _usuarioState

    init {
        repository = UsuarioRepository(application)
        // getAllUsuarios()
    }

    private fun getAllUsuarios() = uiScope.launch {
        val usuarios = withContext(Dispatchers.IO) {
            repository.getAllUsers()
        }
        _usuarios.value = usuarios?.value
    }

    fun allUsuarios() = getAllUsuarios()

    suspend fun insertaUsuario(usuario: Usuario) = uiScope.launch {
        val res = withContext(Dispatchers.IO) {
            repository.newUsuario(usuario)
        }

        _registroResult.value = RegistroResult(exitoso = res)

    }

    override fun onCleared() {
        super.onCleared()
        uiScope.cancel()
    }

}