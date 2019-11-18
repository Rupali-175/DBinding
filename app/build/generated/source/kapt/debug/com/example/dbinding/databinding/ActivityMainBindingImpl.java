package com.example.dbinding.databinding;
import com.example.dbinding.R;
import com.example.dbinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.dbinding.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.Button) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recycleHorizontal.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.dbinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.presenter == variableId) {
            setPresenter((com.example.dbinding.presenter.ContentPresenter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPresenter(@Nullable com.example.dbinding.presenter.ContentPresenter Presenter) {
        updateRegistration(0, Presenter);
        this.mPresenter = Presenter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.presenter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePresenter((com.example.dbinding.presenter.ContentPresenter) object, fieldId);
        }
        return false;
    }
    private boolean onChangePresenter(com.example.dbinding.presenter.ContentPresenter Presenter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.adapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.data) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.example.dbinding.presenter.ContentPresenter presenter = mPresenter;
        com.example.dbinding.view.ContentAdapter presenterAdapter = null;
        java.util.List<com.example.dbinding.model.Content> presenterData = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (presenter != null) {
                    // read presenter.adapter
                    presenterAdapter = presenter.getAdapter();
                    // read presenter.data
                    presenterData = presenter.getData();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.example.dbinding.presenter.ContentPresenter.bind(this.recycleHorizontal, presenterAdapter, presenterData);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.txtTitle.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // presenter != null
        boolean presenterJavaLangObjectNull = false;
        // presenter
        com.example.dbinding.presenter.ContentPresenter presenter = mPresenter;



        presenterJavaLangObjectNull = (presenter) != (null);
        if (presenterJavaLangObjectNull) {



            presenter.getContent(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): presenter
        flag 1 (0x2L): presenter.adapter
        flag 2 (0x3L): presenter.data
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}