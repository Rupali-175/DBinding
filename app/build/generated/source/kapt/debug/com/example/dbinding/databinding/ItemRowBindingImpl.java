package com.example.dbinding.databinding;
import com.example.dbinding.R;
import com.example.dbinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRowBindingImpl extends ItemRowBinding  {

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

    public ItemRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.content == variableId) {
            setContent((com.example.dbinding.model.Content) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContent(@Nullable com.example.dbinding.model.Content Content) {
        updateRegistration(0, Content);
        this.mContent = Content;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.content);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeContent((com.example.dbinding.model.Content) object, fieldId);
        }
        return false;
    }
    private boolean onChangeContent(com.example.dbinding.model.Content Content, int fieldId) {
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
        java.lang.String stringValueOfContentNameToUpperCase = null;
        com.example.dbinding.model.Content content = mContent;
        java.lang.String stringValueOfContentPrice = null;
        boolean textUtilsIsEmptyContentType = false;
        int textUtilsIsEmptyContentTypeViewGONEViewVISIBLE = 0;
        java.lang.String stringValueOfContentName = null;
        java.lang.String contentPrice = null;
        java.lang.String stringValueOfContentPriceToLowerCase = null;
        java.lang.String contentName = null;
        java.lang.String contentType = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (content != null) {
                        // read content.price
                        contentPrice = content.getPrice();
                    }


                    // read String.valueOf(content.price)
                    stringValueOfContentPrice = java.lang.String.valueOf(contentPrice);


                    if (stringValueOfContentPrice != null) {
                        // read String.valueOf(content.price).toLowerCase()
                        stringValueOfContentPriceToLowerCase = stringValueOfContentPrice.toLowerCase();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (content != null) {
                        // read content.name
                        contentName = content.getName();
                    }


                    // read String.valueOf(content.name)
                    stringValueOfContentName = java.lang.String.valueOf(contentName);


                    if (stringValueOfContentName != null) {
                        // read String.valueOf(content.name).toUpperCase()
                        stringValueOfContentNameToUpperCase = stringValueOfContentName.toUpperCase();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (content != null) {
                        // read content.type
                        contentType = content.getType();
                    }


                    // read TextUtils.isEmpty(content.type)
                    textUtilsIsEmptyContentType = android.text.TextUtils.isEmpty(contentType);
                if((dirtyFlags & 0x19L) != 0) {
                    if(textUtilsIsEmptyContentType) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read TextUtils.isEmpty(content.type) ? View.GONE : View.VISIBLE
                    textUtilsIsEmptyContentTypeViewGONEViewVISIBLE = ((textUtilsIsEmptyContentType) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, stringValueOfContentNameToUpperCase);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringValueOfContentPriceToLowerCase);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, contentType);
            this.mboundView3.setVisibility(textUtilsIsEmptyContentTypeViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): content
        flag 1 (0x2L): content.name
        flag 2 (0x3L): content.price
        flag 3 (0x4L): content.type
        flag 4 (0x5L): null
        flag 5 (0x6L): TextUtils.isEmpty(content.type) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): TextUtils.isEmpty(content.type) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}