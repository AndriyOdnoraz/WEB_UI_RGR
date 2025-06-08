package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentQuestionsBindingImpl extends FragmentQuestionsBinding implements com.example.lab3ui.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentQuestionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentQuestionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.addQuestionButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.questionsCard.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.lab3ui.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.questionFragment == variableId) {
            setQuestionFragment((com.example.lab3ui.ui.questions.QuestionsFragment) variable);
        }
        else if (BR.repository == variableId) {
            setRepository((com.example.lab3ui.data.Repository) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lab3ui.ui.questions.QuestionsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuestionFragment(@Nullable com.example.lab3ui.ui.questions.QuestionsFragment QuestionFragment) {
        this.mQuestionFragment = QuestionFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.questionFragment);
        super.requestRebind();
    }
    public void setRepository(@Nullable com.example.lab3ui.data.Repository Repository) {
        this.mRepository = Repository;
    }
    public void setViewModel(@Nullable com.example.lab3ui.ui.questions.QuestionsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelQuestionList((androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Question>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelQuestionList(androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Question>> ViewModelQuestionList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Question>> viewModelQuestionList = null;
        com.example.lab3ui.ui.questions.QuestionsFragment questionFragment = mQuestionFragment;
        java.util.List<com.example.lab3ui.data.models.Question> viewModelQuestionListGetValue = null;
        com.example.lab3ui.ui.questions.QuestionsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.questionList
                    viewModelQuestionList = viewModel.getQuestionList();
                }
                updateLiveDataRegistration(0, viewModelQuestionList);


                if (viewModelQuestionList != null) {
                    // read viewModel.questionList.getValue()
                    viewModelQuestionListGetValue = viewModelQuestionList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.addQuestionButton.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.example.lab3ui.BindingAdaptersKt.bindRecyclerView(this.questionsCard, viewModelQuestionListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // questionFragment
        com.example.lab3ui.ui.questions.QuestionsFragment questionFragment = mQuestionFragment;
        // questionFragment != null
        boolean questionFragmentJavaLangObjectNull = false;



        questionFragmentJavaLangObjectNull = (questionFragment) != (null);
        if (questionFragmentJavaLangObjectNull) {


            questionFragment.goToCreteQuestionFragment();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.questionList
        flag 1 (0x2L): questionFragment
        flag 2 (0x3L): repository
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}