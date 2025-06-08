package com.example.lab3ui.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006!"}, d2 = {"Lcom/example/lab3ui/data/Repository;", "", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "currentQuestionId", "", "getCurrentQuestionId", "()I", "setCurrentQuestionId", "(I)V", "currentUser", "Lcom/example/lab3ui/data/models/User;", "getCurrentUser", "()Lcom/example/lab3ui/data/models/User;", "setCurrentUser", "(Lcom/example/lab3ui/data/models/User;)V", "refreshToken", "getRefreshToken", "setRefreshToken", "getAccessTokenForHeader", "login", "", "username", "password", "logout", "register", "request", "Lcom/example/lab3ui/network/RegisterRequest;", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String accessToken = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String refreshToken = "";
    @org.jetbrains.annotations.Nullable()
    private static com.example.lab3ui.data.models.User currentUser;
    private static int currentQuestionId = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lab3ui.data.Repository INSTANCE = null;
    
    private Repository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    public final void setRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.lab3ui.data.models.User getCurrentUser() {
        return null;
    }
    
    public final void setCurrentUser(@org.jetbrains.annotations.Nullable()
    com.example.lab3ui.data.models.User p0) {
    }
    
    public final int getCurrentQuestionId() {
        return 0;
    }
    
    public final void setCurrentQuestionId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessTokenForHeader() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    com.example.lab3ui.network.RegisterRequest request) {
    }
    
    public final void logout() {
    }
}