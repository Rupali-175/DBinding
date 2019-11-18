// Generated by data binding compiler. Do not edit!
package com.example.dbinding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.dbinding.R;
import com.example.dbinding.presenter.ContentPresenter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainKtBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recycleHorizontal;

  @NonNull
  public final Button txtTitle;

  @Bindable
  protected ContentPresenter mPresenter;

  protected ActivityMainKtBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recycleHorizontal, Button txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recycleHorizontal = recycleHorizontal;
    this.txtTitle = txtTitle;
  }

  public abstract void setPresenter(@Nullable ContentPresenter presenter);

  @Nullable
  public ContentPresenter getPresenter() {
    return mPresenter;
  }

  @NonNull
  public static ActivityMainKtBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main_kt, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainKtBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainKtBinding>inflateInternal(inflater, R.layout.activity_main_kt, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainKtBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main_kt, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainKtBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainKtBinding>inflateInternal(inflater, R.layout.activity_main_kt, null, false, component);
  }

  public static ActivityMainKtBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainKtBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainKtBinding)bind(component, view, R.layout.activity_main_kt);
  }
}
