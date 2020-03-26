package com.example.evaluacionaxsislogin.ui.usuarios

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.evaluacionaxsislogin.data.UsuarioRepository
import com.example.evaluacionaxsislogin.data.model.UsuarioDao

class UsuarioViewModelFactory(
    private val repository: UsuarioRepository,
    private val application: Application
) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UsuarioViewModel::class.java)) {
            return UsuarioViewModel(repository, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}