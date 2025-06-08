package com.example.lab3ui.ui.createquestion;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/example/lab3ui/ui/createquestion/CreateQuestionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_answerList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/lab3ui/data/models/AnswerRequest;", "answerList", "Landroidx/lifecycle/LiveData;", "getAnswerList", "()Landroidx/lifecycle/LiveData;", "questionText", "", "getQuestionText", "()Ljava/lang/String;", "setQuestionText", "(Ljava/lang/String;)V", "addAnswer", "", "answerText", "addQuestion", "deleteAnswer", "position", "", "app_debug"})
public final class CreateQuestionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String questionText = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.lab3ui.data.models.AnswerRequest>> _answerList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.AnswerRequest>> answerList = null;
    
    public CreateQuestionViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuestionText() {
        return null;
    }
    
    public final void setQuestionText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.AnswerRequest>> getAnswerList() {
        return null;
    }
    
    public final void addAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String answerText) {
    }
    
    public final void deleteAnswer(int position) {
    }
    
    public final void addQuestion() {
    }
}