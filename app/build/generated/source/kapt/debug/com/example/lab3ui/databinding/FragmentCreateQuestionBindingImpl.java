package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCreateQuestionBindingImpl extends FragmentCreateQuestionBinding implements com.example.lab3ui.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.questionEditText, 3);
        sViewsWithIds.put(R.id.recyclerView, 4);
        sViewsWithIds.put(R.id.answerEditText, 5);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCreateQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentCreateQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            );
        this.addAnswerButton.setTag(null);
        this.addQuestionButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.lab3ui.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.example.lab3ui.generated.callback.OnClickListener(this, 2);
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
        if (BR.fragment == variableId) {
            setFragment((com.example.lab3ui.ui.createquestion.CreateQuestionFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lab3ui.ui.createquestion.CreateQuestionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.example.lab3ui.ui.createquestion.CreateQuestionFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lab3ui.ui.createquestion.CreateQuestionViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        com.example.lab3ui.ui.createquestion.CreateQuestionFragment fragment = mFragment;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addAnswerButton.setOnClickListener(mCallback3);
            this.addQuestionButton.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // fragment
                com.example.lab3ui.ui.createquestion.CreateQuestionFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addAnswer();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // fragment
                com.example.lab3ui.ui.createquestion.CreateQuestionFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.addQuestion();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}