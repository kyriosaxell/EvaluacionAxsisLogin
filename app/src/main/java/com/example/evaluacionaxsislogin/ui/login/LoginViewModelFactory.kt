package com.example.evaluacionaxsislogin.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.evaluacionaxsislogin.data.model.LoginDao
import com.example.evaluacionaxsislogin.data.LoginRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.NewInstanceFactory() {

/*
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                    loginRepository = LoginRepository(
                            LoginDao)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }*/
}
