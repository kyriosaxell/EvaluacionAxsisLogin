package com.example.evaluacionaxsislogin.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.evaluacionaxsislogin.data.Converters
import com.example.evaluacionaxsislogin.data.model.LoginDao
import com.example.evaluacionaxsislogin.data.model.Usuario
import com.example.evaluacionaxsislogin.data.model.UsuarioDao

@Database(entities = [Usuario::class], version = 3, exportSchema = false)
@TypeConverters(Converters::class)
abstract class UsuarioRoomDataBase : RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao
    abstract fun loginDataSource(): LoginDao

    companion object {
        @Volatile
        private var INSTANCE: UsuarioRoomDataBase? = null

        fun getDatabase(context: Context): UsuarioRoomDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(UsuarioRoomDataBase::class) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        UsuarioRoomDataBase::class.java,
                        "usuarios_db"
                    ).fallbackToDestructiveMigration().allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

}