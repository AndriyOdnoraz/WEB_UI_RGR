package com.example.lab3ui.data.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/example/lab3ui/data/models/Question;", "", "id", "", "questionText", "", "authorUsername", "authorId", "pubDate", "answers", "", "Lcom/example/lab3ui/data/models/Answer;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "getAnswers", "()Ljava/util/List;", "getAuthorId", "()I", "getAuthorUsername", "()Ljava/lang/String;", "getId", "getPubDate", "getQuestionText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Question {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String questionText = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String authorUsername = null;
    private final int authorId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pubDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.lab3ui.data.models.Answer> answers = null;
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.lab3ui.data.models.Answer> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lab3ui.data.models.Question copy(int id, @com.squareup.moshi.Json(name = "question_text")
    @org.jetbrains.annotations.NotNull()
    java.lang.String questionText, @com.squareup.moshi.Json(name = "author_username")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorUsername, @com.squareup.moshi.Json(name = "author")
    int authorId, @com.squareup.moshi.Json(name = "pub_date")
    @org.jetbrains.annotations.NotNull()
    java.lang.String pubDate, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lab3ui.data.models.Answer> answers) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public Question(int id, @com.squareup.moshi.Json(name = "question_text")
    @org.jetbrains.annotations.NotNull()
    java.lang.String questionText, @com.squareup.moshi.Json(name = "author_username")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorUsername, @com.squareup.moshi.Json(name = "author")
    int authorId, @com.squareup.moshi.Json(name = "pub_date")
    @org.jetbrains.annotations.NotNull()
    java.lang.String pubDate, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lab3ui.data.models.Answer> answers) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuestionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthorUsername() {
        return null;
    }
    
    public final int getAuthorId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPubDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.lab3ui.data.models.Answer> getAnswers() {
        return null;
    }
}