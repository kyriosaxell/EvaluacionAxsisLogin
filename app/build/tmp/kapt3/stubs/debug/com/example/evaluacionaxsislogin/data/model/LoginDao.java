package com.example.evaluacionaxsislogin.data.model;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/evaluacionaxsislogin/data/model/LoginDao;", "", "loginUsuario", "Landroidx/lifecycle/LiveData;", "", "email", "", "password", "app_debug"})
public abstract interface LoginDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT ID FROM tcusuarios WHERE email = :email and contrasena = :password")
    public abstract androidx.lifecycle.LiveData<java.lang.Long> loginUsuario(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
}