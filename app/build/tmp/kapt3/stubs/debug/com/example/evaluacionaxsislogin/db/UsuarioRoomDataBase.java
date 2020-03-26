package com.example.evaluacionaxsislogin.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.evaluacionaxsislogin.data.Converters.class})
@androidx.room.Database(entities = {com.example.evaluacionaxsislogin.data.model.Usuario.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/evaluacionaxsislogin/db/UsuarioRoomDataBase;", "Landroidx/room/RoomDatabase;", "()V", "loginDataSource", "Lcom/example/evaluacionaxsislogin/data/model/LoginDao;", "usuarioDao", "Lcom/example/evaluacionaxsislogin/data/model/UsuarioDao;", "Companion", "app_debug"})
public abstract class UsuarioRoomDataBase extends androidx.room.RoomDatabase {
    private static volatile com.example.evaluacionaxsislogin.db.UsuarioRoomDataBase INSTANCE;
    public static final com.example.evaluacionaxsislogin.db.UsuarioRoomDataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.evaluacionaxsislogin.data.model.UsuarioDao usuarioDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.evaluacionaxsislogin.data.model.LoginDao loginDataSource();
    
    public UsuarioRoomDataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/evaluacionaxsislogin/db/UsuarioRoomDataBase$Companion;", "", "()V", "INSTANCE", "Lcom/example/evaluacionaxsislogin/db/UsuarioRoomDataBase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.evaluacionaxsislogin.db.UsuarioRoomDataBase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}