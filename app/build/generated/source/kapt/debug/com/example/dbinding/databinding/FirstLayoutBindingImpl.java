package com.example.dbinding.databinding;
import com.example.dbinding.R;
import com.example.dbinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FirstLayoutBindingImpl extends FirstLayoutBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FirstLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FirstLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.mcontent == variableId) {
            setMcontent((com.example.dbinding.model.Content) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMcontent(@Nullable com.example.dbinding.model.Content Mcontent) {
        updateRegistration(0, Mcontent);
        this.mMcontent = Mcontent;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mcontent);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMcontent((com.example.dbinding.model.Content) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMcontent(com.example.dbinding.model.Content Mcontent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.price) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.type) {
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
        java.lang.String stringValueOfMcontentName = null;
        boolean textUtilsIsEmptyMcontentType = false;
        java.lang.String mcontentPrice = null;
        java.lang.String stringValueOfMcontentPrice = null;
        java.lang.String stringValueOfMcontentPriceToLowerCase = null;
        java.lang.String stringValueOfMcontentNameToUpperCase = null;
        java.lang.String mcontentType = null;
        int textUtilsIsEmptyMcontentTypeViewGONEViewVISIBLE = 0;
        java.lang.String mcontentName = null;
        com.example.dbinding.model.Content mcontent = mMcontent;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (mcontent != null) {
                        // read mcontent.price
                        mcontentPrice = mcontent.getPrice();
                    }


                    // read String.valueOf(mcontent.price)
                    stringValueOfMcontentPrice = java.lang.String.valueOf(mcontentPrice);


                    if (stringValueOfMcontentPrice != null) {
                        // read String.valueOf(mcontent.price).toLowerCase()
                        stringValueOfMcontentPriceToLowerCase = stringValueOfMcontentPrice.toLowerCase();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (mcontent != null) {
                        // read mcontent.type
                        mcontentType = mcontent.getType();
                    }


                    // read TextUtils.isEmpty(mcontent.type)
                    textUtilsIsEmptyMcontentType = android.text.TextUtils.isEmpty(mcontentType);
                if((dirtyFlags & 0x19L) != 0) {
                    if(textUtilsIsEmptyMcontentType) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read TextUtils.isEmpty(mcontent.type) ? View.GONE : View.VISIBLE
                    textUtilsIsEmptyMcontentTypeViewGONEViewVISIBLE = ((textUtilsIsEmptyMcontentType) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (mcontent != null) {
                        // read mcontent.name
                        mcontentName = mcontent.getName();
                    }


                    // read String.valueOf(mcontent.name)
                    stringValueOfMcontentName = java.lang.String.valueOf(mcontentName);


                    if (stringValueOfMcontentName != null) {
                        // read String.valueOf(mcontent.name).toUpperCase()
                        stringValueOfMcontentNameToUpperCase = stringValueOfMcontentName.toUpperCase();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, stringValueOfMcontentNameToUpperCase);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringValueOfMcontentPriceToLowerCase);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mcontentType);
            this.mboundView3.setVisibility(textUtilsIsEmptyMcontentTypeViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mcontent
        flag 1 (0x2L): mcontent.name
        flag 2 (0x3L): mcontent.price
        flag 3 (0x4L): mcontent.type
        flag 4 (0x5L): null
        flag 5 (0x6L): TextUtils.isEmpty(mcontent.type) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): TextUtils.isEmpty(mcontent.type) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}