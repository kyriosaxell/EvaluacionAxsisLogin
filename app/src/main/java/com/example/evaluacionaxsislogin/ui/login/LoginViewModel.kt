package com.example.evaluacionaxsislogin.ui.login


import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import android.util.Patterns
import androidx.lifecycle.AndroidViewModel
import com.example.evaluacionaxsislogin.data.LoginRepository
import com.example.evaluacionaxsislogin.R
import com.example.evaluacionaxsislogin.db.UsuarioRoomDataBase

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val _loginForm = MutableLiveData<LoginFormState>()
    val loginFormState: LiveData<LoginFormState> = _loginForm

    private val _loginResult = MutableLiveData<LoginResult>()
    val loginResult: LiveData<LoginResult> = _loginResult

    private val repository: LoginRepository

    init {
        val loginDao = UsuarioRoomDataBase.getDatabase(application).loginDataSource()
        repository = LoginRepository(loginDao)
    }

    fun login(username: String, password: String) {
        // can be launched in a separate asynchronous job

        val result = repository.login(username, password)

        if (result?.value.toString() !== "null") {
            _loginResult.value =
                LoginResult(success = LoggedInUserView(idUsuario = result?.value.toString()))
            //Log.d("AXELL", "res")
        } else {
            //Log.d("AXELL", "no")
            _loginResult.value = LoginResult(error = R.string.login_failed)
        }
    }

    fun loginDataChanged(username: String, password: String) {
        if (!isUserNameValid(username)) {
            _loginForm.value = LoginFormState(usernameError = R.string.invalid_username)
        } else if (!isPasswordValid(password)) {
            _loginForm.value = LoginFormState(passwordError = R.string.invalid_password)
        } else {
            _loginForm.value = LoginFormState(isDataValid = true)
        }
    }

    // A placeholder username validation check
    private fun isUserNameValid(username: String): Boolean {
        return if (username.contains('@')) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            false
        }
    }

    // A placeholder password validation check
    private fun isPasswordValid(password: String): Boolean {
        return password.length > 9
    }
}
