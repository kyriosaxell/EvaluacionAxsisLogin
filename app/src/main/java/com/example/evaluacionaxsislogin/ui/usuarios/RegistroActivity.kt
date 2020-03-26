package com.example.evaluacionaxsislogin.ui.usuarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.evaluacionaxsislogin.R
import com.example.evaluacionaxsislogin.data.UsuarioRepository
import com.example.evaluacionaxsislogin.data.model.Usuario
import com.example.evaluacionaxsislogin.data.model.UsuarioDao
import com.example.evaluacionaxsislogin.db.UsuarioRoomDataBase
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class RegistroActivity : AppCompatActivity() {
    private var usuarioViewModel: UsuarioViewModel? = null
    private val context = this
    private var job: Job = Job()

    val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val btn_registrar = findViewById<MaterialButton>(R.id.btn_registrar)
        val edt_email = findViewById<TextInputEditText>(R.id.edt_email)
        val edt_username = findViewById<TextInputEditText>(R.id.edt_username)
        val edt_password = findViewById<TextInputEditText>(R.id.edt_password)
        val edt_password2 = findViewById<TextInputEditText>(R.id.edt_password2)

        //viewmodel, factory se instancian
        val repository = UsuarioRepository(context.application)
        val mainViewModelFactory = UsuarioViewModelFactory(repository, context.application)
        usuarioViewModel =
            ViewModelProvider(this, mainViewModelFactory).get(UsuarioViewModel::class.java)

        // config de toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        //Observers
        usuarioViewModel?.usuarioFormState?.observe(this@RegistroActivity, Observer {
            val usuarioState = it ?: return@Observer

            btn_registrar.isEnabled = usuarioState.isDataValid

        })

        usuarioViewModel?.registro_result?.observe(this@RegistroActivity, Observer {
            val registroResult = it ?: return@Observer

            Log.d("AXELL", "regist: ${registroResult.exitoso}")
        })
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //registra al usuario
        btn_registrar.setOnClickListener {

            val usuario = Usuario(
                email = edt_email.text.toString(),
                user = edt_username?.text.toString(),
                contrasena = edt_password.text.toString(),
                estatus = true,
                sexo = "H"
            )

            lifecycleScope.launch {
                usuarioViewModel!!.insertaUsuario(usuario)

            }

            // Toast.makeText(context, u., Toast.LENGTH_SHORT).show()


        }

        edt_username?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                Log.d("AXELL", edt_username.text.toString())
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
