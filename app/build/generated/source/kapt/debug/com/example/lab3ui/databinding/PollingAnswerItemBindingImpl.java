package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PollingAnswerItemBindingImpl extends PollingAnswerItemBinding  {

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

    public PollingAnswerItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private PollingAnswerItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.chooseAnswerRadioButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pollingAnswerTextView.setTag(null);
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
        if (BR.answer == variableId) {
            setAnswer((com.example.lab3ui.data.models.Answer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAnswer(@Nullable com.example.lab3ui.data.models.Answer Answer) {
        this.mAnswer = Answer;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.answer);
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
        int answerVotes = 0;
        java.lang.String pollingAnswerTextViewAndroidStringPollingAnswerTextAnswerVotesAnswerAnswerText = null;
        com.example.lab3ui.data.models.Answer answer = mAnswer;
        java.lang.String answerAnswerText = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (answer != null) {
                    // read answer.votes
                    answerVotes = answer.getVotes();
                    // read answer.answerText
                    answerAnswerText = answer.getAnswerText();
                }


                // read @android:string/polling_answer_text
                pollingAnswerTextViewAndroidStringPollingAnswerTextAnswerVotesAnswerAnswerText = pollingAnswerTextView.getResources().getString(R.string.polling_answer_text, answerVotes, answerAnswerText);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chooseAnswerRadioButton, answerAnswerText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pollingAnswerTextView, pollingAnswerTextViewAndroidStringPollingAnswerTextAnswerVotesAnswerAnswerText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): answer
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}