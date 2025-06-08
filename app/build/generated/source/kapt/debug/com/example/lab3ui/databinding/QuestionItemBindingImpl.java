package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class QuestionItemBindingImpl extends QuestionItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public QuestionItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private QuestionItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.addedAnswerTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pubDateTextView.setTag(null);
        this.questionAuthorTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.question == variableId) {
            setQuestion((com.example.lab3ui.data.models.Question) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuestion(@Nullable com.example.lab3ui.data.models.Question Question) {
        this.mQuestion = Question;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.question);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String questionQuestionText = null;
        java.lang.String questionPubDate = null;
        java.lang.String pubDateTextViewAndroidStringPublishedAtTextQuestionPubDate = null;
        com.example.lab3ui.data.models.Question question = mQuestion;
        java.lang.String questionAuthorUsername = null;
        java.lang.String questionAuthorTextViewAndroidStringCreateByStringQuestionAuthorUsername = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (question != null) {
                    // read question.questionText
                    questionQuestionText = question.getQuestionText();
                    // read question.pubDate
                    questionPubDate = question.getPubDate();
                    // read question.authorUsername
                    questionAuthorUsername = question.getAuthorUsername();
                }


                // read @android:string/published_at_text
                pubDateTextViewAndroidStringPublishedAtTextQuestionPubDate = pubDateTextView.getResources().getString(R.string.published_at_text, questionPubDate);
                // read @android:string/create_by_string
                questionAuthorTextViewAndroidStringCreateByStringQuestionAuthorUsername = questionAuthorTextView.getResources().getString(R.string.create_by_string, questionAuthorUsername);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addedAnswerTextView, questionQuestionText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pubDateTextView, pubDateTextViewAndroidStringPublishedAtTextQuestionPubDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.questionAuthorTextView, questionAuthorTextViewAndroidStringCreateByStringQuestionAuthorUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): question
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}