package com.example.lab3ui.ui.polling;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\bH\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\""}, d2 = {"Lcom/example/lab3ui/ui/polling/PollingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_answerList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/lab3ui/data/models/Answer;", "_canDeleteQuestion", "", "_canVote", "_question", "Lcom/example/lab3ui/data/models/Question;", "answerList", "Landroidx/lifecycle/LiveData;", "getAnswerList", "()Landroidx/lifecycle/LiveData;", "canDeleteQuestion", "getCanDeleteQuestion", "setCanDeleteQuestion", "(Landroidx/lifecycle/LiveData;)V", "canVote", "getCanVote", "question", "getQuestion", "selectedAnswerPosition", "", "getSelectedAnswerPosition", "()I", "setSelectedAnswerPosition", "(I)V", "calcCanDeleteQuestion", "deleteQuestion", "", "vote", "app_debug"})
public final class PollingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.lab3ui.data.models.Question> _question = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lab3ui.data.models.Question> question = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _canVote = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> canVote = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _canDeleteQuestion = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> canDeleteQuestion;
    private int selectedAnswerPosition = -1;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.lab3ui.data.models.Answer>> _answerList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Answer>> answerList = null;
    
    public PollingViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lab3ui.data.models.Question> getQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCanVote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCanDeleteQuestion() {
        return null;
    }
    
    public final void setCanDeleteQuestion(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    public final int getSelectedAnswerPosition() {
        return 0;
    }
    
    public final void setSelectedAnswerPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Answer>> getAnswerList() {
        return null;
    }
    
    private final boolean calcCanDeleteQuestion() {
        return false;
    }
    
    public final void vote() {
    }
    
    public final void deleteQuestion() {
    }
}