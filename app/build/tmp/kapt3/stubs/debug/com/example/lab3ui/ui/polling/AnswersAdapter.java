package com.example.lab3ui.ui.polling;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0014\u0010\u001a\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u000f\u001a\u00020\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/lab3ui/ui/polling/AnswersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/lab3ui/ui/polling/AnswersAdapter$AnswerViewHolder;", "viewModel", "Lcom/example/lab3ui/ui/polling/PollingViewModel;", "(Lcom/example/lab3ui/ui/polling/PollingViewModel;)V", "answerList", "", "Lcom/example/lab3ui/data/models/Answer;", "isNewRadioButtonChecked", "", "lastCheckedPosition", "", "getViewModel", "()Lcom/example/lab3ui/ui/polling/PollingViewModel;", "wasVoted", "checkButton", "", "position", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnswersList", "answersList", "AnswerViewHolder", "app_debug"})
public final class AnswersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.lab3ui.ui.polling.AnswersAdapter.AnswerViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.lab3ui.ui.polling.PollingViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.lab3ui.data.models.Answer> answerList;
    private boolean isNewRadioButtonChecked = false;
    private int lastCheckedPosition = -1;
    private boolean wasVoted = false;
    
    public AnswersAdapter(@org.jetbrains.annotations.NotNull()
    com.example.lab3ui.ui.polling.PollingViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lab3ui.ui.polling.PollingViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.lab3ui.ui.polling.AnswersAdapter.AnswerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.lab3ui.ui.polling.AnswersAdapter.AnswerViewHolder holder, int position) {
    }
    
    private final void checkButton(int position) {
    }
    
    public final void setAnswersList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lab3ui.data.models.Answer> answersList) {
    }
    
    public final void wasVoted() {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/lab3ui/ui/polling/AnswersAdapter$AnswerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/lab3ui/databinding/PollingAnswerItemBinding;", "(Lcom/example/lab3ui/databinding/PollingAnswerItemBinding;)V", "getBinding", "()Lcom/example/lab3ui/databinding/PollingAnswerItemBinding;", "bind", "", "answer", "Lcom/example/lab3ui/data/models/Answer;", "app_debug"})
    public static final class AnswerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.lab3ui.databinding.PollingAnswerItemBinding binding = null;
        
        public AnswerViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.lab3ui.databinding.PollingAnswerItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.lab3ui.databinding.PollingAnswerItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.lab3ui.data.models.Answer answer) {
        }
    }
}