package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPollingBindingImpl extends FragmentPollingBinding implements com.example.lab3ui.generated.callback.OnClickListener.Listener {

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
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPollingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentPollingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[3]
            );
        this.answersList.setTag(null);
        this.deleteQuestionButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.questionTextView.setTag(null);
        this.voteButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.lab3ui.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.example.lab3ui.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setFragment((com.example.lab3ui.ui.polling.PollingFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lab3ui.ui.polling.PollingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.example.lab3ui.ui.polling.PollingFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lab3ui.ui.polling.PollingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelQuestion((androidx.lifecycle.LiveData<com.example.lab3ui.data.models.Question>) object, fieldId);
            case 1 :
                return onChangeViewModelAnswerList((androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Answer>>) object, fieldId);
            case 2 :
                return onChangeViewModelCanDeleteQuestion((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelCanVote((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelQuestion(androidx.lifecycle.LiveData<com.example.lab3ui.data.models.Question> ViewModelQuestion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAnswerList(androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Answer>> ViewModelAnswerList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCanDeleteQuestion(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelCanDeleteQuestion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCanVote(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelCanVote, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelCanDeleteQuestionGetValue = false;
        androidx.lifecycle.LiveData<com.example.lab3ui.data.models.Question> viewModelQuestion = null;
        java.util.List<com.example.lab3ui.data.models.Answer> viewModelAnswerListGetValue = null;
        com.example.lab3ui.ui.polling.PollingFragment fragment = mFragment;
        androidx.lifecycle.LiveData<java.util.List<com.example.lab3ui.data.models.Answer>> viewModelAnswerList = null;
        java.lang.String viewModelQuestionQuestionText = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelCanVoteGetValue = false;
        java.lang.Boolean viewModelCanVoteGetValue = null;
        java.lang.Boolean viewModelCanDeleteQuestionGetValue = null;
        com.example.lab3ui.data.models.Question viewModelQuestionGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelCanDeleteQuestion = null;
        int viewModelCanDeleteQuestionViewVISIBLEViewGONE = 0;
        int viewModelCanVoteViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelCanVote = null;
        com.example.lab3ui.ui.polling.PollingViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.question
                        viewModelQuestion = viewModel.getQuestion();
                    }
                    updateLiveDataRegistration(0, viewModelQuestion);


                    if (viewModelQuestion != null) {
                        // read viewModel.question.getValue()
                        viewModelQuestionGetValue = viewModelQuestion.getValue();
                    }


                    if (viewModelQuestionGetValue != null) {
                        // read viewModel.question.getValue().questionText
                        viewModelQuestionQuestionText = viewModelQuestionGetValue.getQuestionText();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.answerList
                        viewModelAnswerList = viewModel.getAnswerList();
                    }
                    updateLiveDataRegistration(1, viewModelAnswerList);


                    if (viewModelAnswerList != null) {
                        // read viewModel.answerList.getValue()
                        viewModelAnswerListGetValue = viewModelAnswerList.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.canDeleteQuestion
                        viewModelCanDeleteQuestion = viewModel.getCanDeleteQuestion();
                    }
                    updateLiveDataRegistration(2, viewModelCanDeleteQuestion);


                    if (viewModelCanDeleteQuestion != null) {
                        // read viewModel.canDeleteQuestion.getValue()
                        viewModelCanDeleteQuestionGetValue = viewModelCanDeleteQuestion.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canDeleteQuestion.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCanDeleteQuestionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCanDeleteQuestionGetValue);
                if((dirtyFlags & 0x64L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelCanDeleteQuestionGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canDeleteQuestion.getValue()) ? View.VISIBLE : View.GONE
                    viewModelCanDeleteQuestionViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelCanDeleteQuestionGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.canVote
                        viewModelCanVote = viewModel.getCanVote();
                    }
                    updateLiveDataRegistration(3, viewModelCanVote);


                    if (viewModelCanVote != null) {
                        // read viewModel.canVote.getValue()
                        viewModelCanVoteGetValue = viewModelCanVote.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canVote.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCanVoteGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCanVoteGetValue);
                if((dirtyFlags & 0x68L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelCanVoteGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canVote.getValue()) ? View.VISIBLE : View.GONE
                    viewModelCanVoteViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelCanVoteGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.example.lab3ui.BindingAdaptersKt.bindRecyclerViewToAnswerList(this.answersList, viewModelAnswerListGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.deleteQuestionButton.setVisibility(viewModelCanDeleteQuestionViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.deleteQuestionButton.setOnClickListener(mCallback2);
            this.voteButton.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.questionTextView, viewModelQuestionQuestionText);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            this.voteButton.setVisibility(viewModelCanVoteViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // fragment
                com.example.lab3ui.ui.polling.PollingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.deleteQuestion();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.example.lab3ui.ui.polling.PollingFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.vote();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.question
        flag 1 (0x2L): viewModel.answerList
        flag 2 (0x3L): viewModel.canDeleteQuestion
        flag 3 (0x4L): viewModel.canVote
        flag 4 (0x5L): fragment
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canDeleteQuestion.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canDeleteQuestion.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canVote.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canVote.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}