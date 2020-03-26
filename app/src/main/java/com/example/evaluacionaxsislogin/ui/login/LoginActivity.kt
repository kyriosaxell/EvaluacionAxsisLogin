package com.example.evaluacionaxsislogin.ui.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.*
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.evaluacionaxsislogin.R
import com.example.evaluacionaxsislogin.ui.usuarios.RegistroActivity
import com.example.evaluacionaxsislogin.ui.usuarios.UsuariosTablaActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val username = findViewById<TextInputLayout>(R.id.username)
        val edt_username = findViewById<TextInputEditText>(R.id.edt_username)
        //val password = findViewById<TextInputLayout>(R.id.password)
        val password = findViewById<TextInputLayout>(R.id.password)
        val edt_password = findViewById<TextInputEditText>(R.id.edt_password)
        val login = findViewById<Button>(R.id.login)
        val loading = findViewById<ProgressBar>(R.id.loading)
        val txt_registrate = findViewById<TextView>(R.id.txt_registrate)

        val context = this
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        loginViewModel.loginFormState.observe(this@LoginActivity, Observer {
            val loginState = it ?: return@Observer

            // disable login button unless both username / password is valid
            login.isEnabled = loginState.isDataValid

            if (loginState.usernameError != null) {
                username.error = getString(loginState.usernameError)
            } else {
                username.error = null
            }
            if (loginState.passwordError != null) {
                password.error = getString(loginState.passwordError)

            } else {
                password.error = null
            }
        })

        loginViewModel.loginResult.observe(this@LoginActivity, Observer {
            val loginResult = it ?: return@Observer

            loading.visibility = View.GONE
            if (loginResult.error != null) {
                Toast.makeText(this, loginResult.error, Toast.LENGTH_SHORT).show()
            }
            if (loginResult.success != null) { //inicio de sesion exitoso
                val intent = Intent(this@LoginActivity, UsuariosTablaActivity::class.java)
                startActivity(intent)
                finish()
            }
            //BORRAR al terminar
            val intent = Intent(this@LoginActivity, UsuariosTablaActivity::class.java)
            startActivity(intent)
            //finish()
            setResult(Activity.RESULT_OK)
        })

        edt_username.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable) {
                loginViewModel.loginDataChanged(
                    edt_username.text.toString(),
                    edt_password.text.toString()
                )
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })



        edt_password.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                loginViewModel.loginDataChanged(
                    edt_username.text.toString(),
                    edt_password.text.toString()
                )
                //Log.d("AXELL",password.editText.toString())
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
            }
        })

        login.setOnClickListener {
            loading.visibility = View.VISIBLE
            loginViewModel.login(username.editText.toString(), edt_password.toString())
        }

        txt_registrate.setOnClickListener {
            val intent = Intent(context, RegistroActivity::class.java)
            startActivity(intent)
        };

    }

}

