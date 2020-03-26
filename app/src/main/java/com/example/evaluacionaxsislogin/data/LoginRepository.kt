package com.example.evaluacionaxsislogin.data

import androidx.lifecycle.LiveData
import com.example.evaluacionaxsislogin.data.model.LoggedInUser
import com.example.evaluacionaxsislogin.data.model.LoginDao

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class LoginRepository(val dao: LoginDao) {


    // in-memory cache of the loggedInUser object
    var user: LoggedInUser? = null
        private set

    val isLoggedIn: Boolean
        get() = user != null

    init {
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
        user = null
    }

    companion object {
        @Volatile
        private var instance: LoginRepository? = null

        fun getInstance(plantDao: LoginDao) =
            instance ?: synchronized(this) {
                instance ?: LoginRepository(plantDao).also { instance = it }
            }
    }

    fun logout() {
        user = null
        //dao.logout()
    }

    //logeo del usuario
    fun login(username: String, password: String): LiveData<Long>? {
        // handle login
        val result = dao.loginUsuario(username, password)

        if (result.toString().isNotEmpty()) {
            return result
        }

        return null
    }

    private fun setLoggedInUser(loggedInUser: LoggedInUser) {
        this.user = loggedInUser
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }
}
