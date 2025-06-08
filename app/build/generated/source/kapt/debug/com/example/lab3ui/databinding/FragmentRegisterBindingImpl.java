package com.example.lab3ui.databinding;
import com.example.lab3ui.R;
import com.example.lab3ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements com.example.lab3ui.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.usernameInput, 2);
        sViewsWithIds.put(R.id.firstNameInput, 3);
        sViewsWithIds.put(R.id.lastNameInput, 4);
        sViewsWithIds.put(R.id.emailInput, 5);
        sViewsWithIds.put(R.id.passwordInput, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.Button) bindings[1]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[2]
            );
        this.loginButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.lab3ui.generated.callback.OnClickListener(this, 1);
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
        if (BR.registerFragment == variableId) {
            setRegisterFragment((com.example.lab3ui.ui.register.RegisterFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterFragment(@Nullable com.example.lab3ui.ui.register.RegisterFragment RegisterFragment) {
        this.mRegisterFragment = RegisterFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.registerFragment);
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
        com.example.lab3ui.ui.register.RegisterFragment registerFragment = mRegisterFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.loginButton.setOnClickListener(mCallback7);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // registerFragment != null
        boolean registerFragmentJavaLangObjectNull = false;
        // registerFragment
        com.example.lab3ui.ui.register.RegisterFragment registerFragment = mRegisterFragment;



        registerFragmentJavaLangObjectNull = (registerFragment) != (null);
        if (registerFragmentJavaLangObjectNull) {


            registerFragment.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}