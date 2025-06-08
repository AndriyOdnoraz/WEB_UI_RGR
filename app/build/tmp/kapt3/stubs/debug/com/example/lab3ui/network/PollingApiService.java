package com.example.lab3ui.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00a7@\u00a2\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u001cH\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u0006\u001a\u00020 H\u00a7@\u00a2\u0006\u0002\u0010!J,\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010$\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010%\u00a8\u0006&"}, d2 = {"Lcom/example/lab3ui/network/PollingApiService;", "", "addQuestion", "Lcom/example/lab3ui/data/models/Question;", "token", "", "request", "Lcom/example/lab3ui/data/models/QuestionRequest;", "(Ljava/lang/String;Lcom/example/lab3ui/data/models/QuestionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteQuestion", "Lretrofit2/Response;", "", "questionId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestion", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/example/lab3ui/data/models/User;", "user", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAlreadyVote", "Lcom/example/lab3ui/network/IsAlreadyVoteResponse;", "login", "Lcom/example/lab3ui/network/LoginResponse;", "Lcom/example/lab3ui/network/LoginRequest;", "(Lcom/example/lab3ui/network/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/example/lab3ui/network/RegisterResponse;", "Lcom/example/lab3ui/network/RegisterRequest;", "(Lcom/example/lab3ui/network/RegisterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vote", "Lcom/example/lab3ui/network/VoteResponse;", "answerId", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PollingApiService {
    
    @retrofit2.http.GET(value = "questions")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getQuestions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lab3ui.data.models.Question>> $completion);
    
    @retrofit2.http.GET(value = "questions/{questionId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getQuestion(@retrofit2.http.Path(value = "questionId")
    int questionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lab3ui.data.models.Question> $completion);
    
    @retrofit2.http.GET(value = "questions/{questionId}/is-already-vote")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isAlreadyVote(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "questionId")
    int questionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lab3ui.network.IsAlreadyVoteResponse> $completion);
    
    @retrofit2.http.DELETE(value = "questions/{questionId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteQuestion(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "questionId")
    int questionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.PATCH(value = "questions/{questionId}/answers/{answerId}/vote")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object vote(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "questionId")
    int questionId, @retrofit2.http.Path(value = "answerId")
    int answerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lab3ui.network.VoteResponse> $completion);
    
    @retrofit2.http.POST(value = "questions")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addQuestion(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.lab3ui.data.models.QuestionRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lab3ui.data.models.Question> $completion);
    
    @retrofit2.http.GET(value = "users/{user}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUser(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @retrofit2.http.Path(value = "user")
    @org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lab3ui.data.models.User> $completion);
    
    @retrofit2.http.POST(value = "token")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.lab3ui.network.LoginRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lab3ui.network.LoginResponse> $completion);
    
    @retrofit2.http.POST(value = "users")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object register(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.lab3ui.network.RegisterRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lab3ui.network.RegisterResponse> $completion);
}