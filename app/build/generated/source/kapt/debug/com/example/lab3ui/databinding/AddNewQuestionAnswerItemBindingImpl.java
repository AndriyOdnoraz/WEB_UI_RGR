package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddNewQuestionAnswerItemBindingImpl extends AddNewQuestionAnswerItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.deleteAnswer, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AddNewQuestionAnswerItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private AddNewQuestionAnswerItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.addedAnswerTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.position == variableId) {
            setPosition((int) variable);
        }
        else if (BR.answer == variableId) {
            setAnswer((com.example.lab3ui.data.models.AnswerRequest) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(int Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setAnswer(@Nullable com.example.lab3ui.data.models.AnswerRequest Answer) {
        this.mAnswer = Answer;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        java.lang.String addedAnswerTextViewAndroidStringAnswerTextTemplatePositionAnswerAnswerText = null;
        int position = mPosition;
        com.example.lab3ui.data.models.AnswerRequest answer = mAnswer;
        java.lang.String answerAnswerText = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (answer != null) {
                    // read answer.answerText
                    answerAnswerText = answer.getAnswerText();
                }


                // read @android:string/answer_text_template
                addedAnswerTextViewAndroidStringAnswerTextTemplatePositionAnswerAnswerText = addedAnswerTextView.getResources().getString(R.string.answer_text_template, position, answerAnswerText);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addedAnswerTextView, addedAnswerTextViewAndroidStringAnswerTextTemplatePositionAnswerAnswerText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): answer
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}