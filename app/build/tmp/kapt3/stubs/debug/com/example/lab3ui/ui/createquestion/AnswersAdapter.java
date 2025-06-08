package com.example.lab3ui.ui.createquestion;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/example/lab3ui/ui/createquestion/AnswersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/lab3ui/ui/createquestion/AnswersAdapter$AnswerViewHolder;", "viewModel", "Lcom/example/lab3ui/ui/createquestion/CreateQuestionViewModel;", "(Lcom/example/lab3ui/ui/createquestion/CreateQuestionViewModel;)V", "answerList", "", "Lcom/example/lab3ui/data/models/AnswerRequest;", "getViewModel", "()Lcom/example/lab3ui/ui/createquestion/CreateQuestionViewModel;", "deleteAnswer", "", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnswersList", "answersList", "AnswerViewHolder", "app_debug"})
public final class AnswersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.lab3ui.ui.createquestion.AnswersAdapter.AnswerViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.lab3ui.ui.createquestion.CreateQuestionViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.lab3ui.data.models.AnswerRequest> answerList;
    
    public AnswersAdapter(@org.jetbrains.annotations.NotNull()
    com.example.lab3ui.ui.createquestion.CreateQuestionViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lab3ui.ui.createquestion.CreateQuestionViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.lab3ui.ui.createquestion.AnswersAdapter.AnswerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.lab3ui.ui.createquestion.AnswersAdapter.AnswerViewHolder holder, int position) {
    }
    
    public final void setAnswersList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lab3ui.data.models.AnswerRequest> answersList) {
    }
    
    public final void deleteAnswer(int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/lab3ui/ui/createquestion/AnswersAdapter$AnswerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/lab3ui/databinding/AddNewQuestionAnswerItemBinding;", "(Lcom/example/lab3ui/databinding/AddNewQuestionAnswerItemBinding;)V", "getBinding", "()Lcom/example/lab3ui/databinding/AddNewQuestionAnswerItemBinding;", "bind", "", "position", "", "answer", "Lcom/example/lab3ui/data/models/AnswerRequest;", "app_debug"})
    public static final class AnswerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.lab3ui.databinding.AddNewQuestionAnswerItemBinding binding = null;
        
        public AnswerViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.lab3ui.databinding.AddNewQuestionAnswerItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.lab3ui.databinding.AddNewQuestionAnswerItemBinding getBinding() {
            return null;
        }
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.example.lab3ui.data.models.AnswerRequest answer) {
        }
    }
}