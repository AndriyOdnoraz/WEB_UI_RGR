package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccountBindingImpl extends FragmentAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logoutButton, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.emailTextView.setTag(null);
        this.firstNameTextView.setTag(null);
        this.lastNameTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.usernameTextView.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.lab3ui.ui.account.AccountViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.lab3ui.ui.account.AccountViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUser((androidx.lifecycle.LiveData<com.example.lab3ui.data.models.User>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUser(androidx.lifecycle.LiveData<com.example.lab3ui.data.models.User> ViewModelUser, int fieldId) {
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
        java.lang.String viewModelUserEmail = null;
        java.lang.String emailTextViewAndroidStringEmailTextViewModelUserEmail = null;
        java.lang.String usernameTextViewAndroidStringUsernameTextViewModelUserUsername = null;
        java.lang.String viewModelUserUsername = null;
        com.example.lab3ui.data.models.User viewModelUserGetValue = null;
        androidx.lifecycle.LiveData<com.example.lab3ui.data.models.User> viewModelUser = null;
        java.lang.String viewModelUserFirstName = null;
        java.lang.String firstNameTextViewAndroidStringFirstNameTextViewModelUserFirstName = null;
        java.lang.String lastNameTextViewAndroidStringLastNameTextViewModelUserLastName = null;
        com.example.lab3ui.ui.account.AccountViewModel viewModel = mViewModel;
        java.lang.String viewModelUserLastName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.user
                    viewModelUser = viewModel.getUser();
                }
                updateLiveDataRegistration(0, viewModelUser);


                if (viewModelUser != null) {
                    // read viewModel.user.getValue()
                    viewModelUserGetValue = viewModelUser.getValue();
                }


                if (viewModelUserGetValue != null) {
                    // read viewModel.user.getValue().email
                    viewModelUserEmail = viewModelUserGetValue.getEmail();
                    // read viewModel.user.getValue().username
                    viewModelUserUsername = viewModelUserGetValue.getUsername();
                    // read viewModel.user.getValue().firstName
                    viewModelUserFirstName = viewModelUserGetValue.getFirstName();
                    // read viewModel.user.getValue().lastName
                    viewModelUserLastName = viewModelUserGetValue.getLastName();
                }


                // read @android:string/email_text
                emailTextViewAndroidStringEmailTextViewModelUserEmail = emailTextView.getResources().getString(R.string.email_text, viewModelUserEmail);
                // read @android:string/username_text
                usernameTextViewAndroidStringUsernameTextViewModelUserUsername = usernameTextView.getResources().getString(R.string.username_text, viewModelUserUsername);
                // read @android:string/first_name_text
                firstNameTextViewAndroidStringFirstNameTextViewModelUserFirstName = firstNameTextView.getResources().getString(R.string.first_name_text, viewModelUserFirstName);
                // read @android:string/last_name_text
                lastNameTextViewAndroidStringLastNameTextViewModelUserLastName = lastNameTextView.getResources().getString(R.string.last_name_text, viewModelUserLastName);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emailTextView, emailTextViewAndroidStringEmailTextViewModelUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstNameTextView, firstNameTextViewAndroidStringFirstNameTextViewModelUserFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastNameTextView, lastNameTextViewAndroidStringLastNameTextViewModelUserLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.usernameTextView, usernameTextViewAndroidStringUsernameTextViewModelUserUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.user
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}