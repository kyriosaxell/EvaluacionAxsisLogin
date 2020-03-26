package com.example.evaluacionaxsislogin.data;

import java.lang.System;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/example/evaluacionaxsislogin/data/LoginRepository;", "", "dao", "Lcom/example/evaluacionaxsislogin/data/model/LoginDao;", "(Lcom/example/evaluacionaxsislogin/data/model/LoginDao;)V", "getDao", "()Lcom/example/evaluacionaxsislogin/data/model/LoginDao;", "isLoggedIn", "", "()Z", "<set-?>", "Lcom/example/evaluacionaxsislogin/data/model/LoggedInUser;", "user", "getUser", "()Lcom/example/evaluacionaxsislogin/data/model/LoggedInUser;", "login", "Landroidx/lifecycle/LiveData;", "", "username", "", "password", "logout", "", "setLoggedInUser", "loggedInUser", "Companion", "app_debug"})
public final class LoginRepository {
    @org.jetbrains.annotations.Nullable()
    private com.example.evaluacionaxsislogin.data.model.LoggedInUser user;
    @org.jetbrains.annotations.NotNull()
    private final com.example.evaluacionaxsislogin.data.model.LoginDao dao = null;
    private static volatile com.example.evaluacionaxsislogin.data.LoginRepository instance;
    public static final com.example.evaluacionaxsislogin.data.LoginRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.evaluacionaxsislogin.data.model.LoggedInUser getUser() {
        return null;
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final void logout() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.lang.Long> login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    private final void setLoggedInUser(com.example.evaluacionaxsislogin.data.model.LoggedInUser loggedInUser) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.evaluacionaxsislogin.data.model.LoginDao getDao() {
        return null;
    }
    
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.example.evaluacionaxsislogin.data.model.LoginDao dao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/evaluacionaxsislogin/data/LoginRepository$Companion;", "", "()V", "instance", "Lcom/example/evaluacionaxsislogin/data/LoginRepository;", "getInstance", "plantDao", "Lcom/example/evaluacionaxsislogin/data/model/LoginDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.evaluacionaxsislogin.data.LoginRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.example.evaluacionaxsislogin.data.model.LoginDao plantDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}