package com.example.evaluacionaxsislogin.ui.usuarios;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/evaluacionaxsislogin/ui/usuarios/UsuarioViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/example/evaluacionaxsislogin/data/UsuarioRepository;", "application", "Landroid/app/Application;", "(Lcom/example/evaluacionaxsislogin/data/UsuarioRepository;Landroid/app/Application;)V", "_registroResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/evaluacionaxsislogin/ui/usuarios/RegistroResult;", "_usuarioState", "Lcom/example/evaluacionaxsislogin/ui/usuarios/UsuarioFormState;", "lista_usuarios", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/evaluacionaxsislogin/data/model/Usuario;", "getLista_usuarios", "()Landroidx/lifecycle/LiveData;", "setLista_usuarios", "(Landroidx/lifecycle/LiveData;)V", "registro_result", "getRegistro_result", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "usuarioFormState", "getUsuarioFormState", "allUsuarios", "insertaUsuario", "Lkotlinx/coroutines/Job;", "usuario", "(Lcom/example/evaluacionaxsislogin/data/model/Usuario;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "", "app_debug"})
public final class UsuarioViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.evaluacionaxsislogin.ui.usuarios.RegistroResult> _registroResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.RegistroResult> registro_result = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final androidx.lifecycle.MutableLiveData<com.example.evaluacionaxsislogin.ui.usuarios.UsuarioFormState> _usuarioState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.UsuarioFormState> usuarioFormState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> lista_usuarios;
    private com.example.evaluacionaxsislogin.data.UsuarioRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.RegistroResult> getRegistro_result() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.usuarios.UsuarioFormState> getUsuarioFormState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> getLista_usuarios() {
        return null;
    }
    
    public final void setLista_usuarios(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.evaluacionaxsislogin.data.model.Usuario>> allUsuarios() {
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