package com.example.evaluacionaxsislogin.data.model;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0019\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\'J!\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J9\u0010\u0018\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/evaluacionaxsislogin/data/model/UsuarioDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findUsuarioById", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/evaluacionaxsislogin/data/model/Usuario;", "id", "", "getAllUsuarios", "insertarUsuario", "usuario", "(Lcom/example/evaluacionaxsislogin/data/model/Usuario;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValidUsuario", "", "user", "", "email", "updateEstatus", "estatus", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "sexo", "contrasena", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UsuarioDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tcusuarios order by fecha_creacion asc")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> getAllUsuarios();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertarUsuario(@org.jetbrains.annotations.NotNull()
    com.example.evaluacionaxsislogin.data.model.Usuario usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM tcusuarios")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tcusuarios WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> findUsuarioById(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE tcusuarios SET email = :email, user = :user, sexo = :sexo, contrasena = :contrasena where id = :id")
    public abstract java.lang.Object updateUser(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    java.lang.String sexo, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p5);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE tcusuarios SET estatus = :estatus where id = :id")
    public abstract java.lang.Object updateEstatus(long id, int estatus, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT EXISTS (SELECT 1 FROM tcusuarios WHERE user = :user OR email LIKE :email LIMIT 1) ")
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> isValidUsuario(@org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    java.lang.String email);
}