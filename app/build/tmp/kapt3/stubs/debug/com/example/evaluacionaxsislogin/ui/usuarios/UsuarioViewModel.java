package com.example.evaluacionaxsislogin.ui.usuarios;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0019\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/evaluacionaxsislogin/ui/usuarios/UsuarioViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/example/evaluacionaxsislogin/data/UsuarioRepository;", "application", "Landroid/app/Application;", "(Lcom/example/evaluacionaxsislogin/data/UsuarioRepository;Landroid/app/Application;)V", "_registroResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/evaluacionaxsislogin/ui/usuarios/RegistroResult;", "_usuarioState", "Lcom/example/evaluacionaxsislogin/ui/usuarios/UsuarioFormState;", "_usuarios", "", "Lcom/example/evaluacionaxsislogin/data/model/Usuario;", "lista_usuarios", "Landroidx/lifecycle/LiveData;", "getLista_usuarios", "()Landroidx/lifecycle/LiveData;", "registro_result", "getRegistro_result", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "usuarioFormState", "getUsuarioFormState", "allUsuarios", "Lkotlinx/coroutines/Job;", "getAllUsuarios", "insertaUsuario", "usuario", "(Lcom/example/evaluacionaxsislogin/data/model/Usuario;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "", "app_debug"})
public final class UsuarioViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> _usuarios = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> lista_usuarios = null;
    private final androidx.lifecycle.MutableLiveData<com.example.evaluacionaxsislogin.ui.usuarios.RegistroResult> _registroResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.RegistroResult> registro_result = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final androidx.lifecycle.MutableLiveData<com.example.evaluacionaxsislogin.ui.usuarios.UsuarioFormState> _usuarioState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.UsuarioFormState> usuarioFormState = null;
    private com.example.evaluacionaxsislogin.data.UsuarioRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> getLista_usuarios() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.RegistroResult> getRegistro_result() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.UsuarioFormState> getUsuarioFormState() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getAllUsuarios() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job allUsuarios() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertaUsuario(@org.jetbrains.annotations.NotNull()
    com.example.evaluacionaxsislogin.data.model.Usuario usuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p1) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public UsuarioViewModel(@org.jetbrains.annotations.NotNull()
    com.example.evaluacionaxsislogin.data.UsuarioRepository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}