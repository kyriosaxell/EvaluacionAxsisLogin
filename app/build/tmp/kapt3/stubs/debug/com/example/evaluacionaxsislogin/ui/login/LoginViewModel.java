package com.example.evaluacionaxsislogin.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/evaluacionaxsislogin/ui/login/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_loginForm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/evaluacionaxsislogin/ui/login/LoginFormState;", "_loginResult", "Lcom/example/evaluacionaxsislogin/ui/login/LoginResult;", "loginFormState", "Landroidx/lifecycle/LiveData;", "getLoginFormState", "()Landroidx/lifecycle/LiveData;", "loginResult", "getLoginResult", "repository", "Lcom/example/evaluacionaxsislogin/data/LoginRepository;", "isPasswordValid", "", "password", "", "isUserNameValid", "username", "login", "", "loginDataChanged", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.evaluacionaxsislogin.ui.login.LoginFormState> _loginForm = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.login.LoginFormState> loginFormState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.evaluacionaxsislogin.ui.login.LoginResult> _loginResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.login.LoginResult> loginResult = null;
    private final com.example.evaluacionaxsislogin.data.LoginRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.login.LoginFormState> getLoginFormState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.evaluacionaxsislogin.ui.login.LoginResult> getLoginResult() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void loginDataChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final boolean isUserNameValid(java.lang.String username) {
        return false;
    }
    
    private final boolean isPasswordValid(java.lang.String password) {
        return false;
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}