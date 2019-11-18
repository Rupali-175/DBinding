// Generated by data binding compiler. Do not edit!
package com.example.dbinding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.dbinding.R;
import com.example.dbinding.model.Product;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SecondLayoutBinding extends ViewDataBinding {
  @Bindable
  protected Product mProduct;

  protected SecondLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setProduct(@Nullable Product product);

  @Nullable
  public Product getProduct() {
    return mProduct;
  }

  @NonNull
  public static SecondLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.second_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SecondLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SecondLayoutBinding>inflateInternal(inflater, R.layout.second_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SecondLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.second_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SecondLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SecondLayoutBinding>inflateInternal(inflater, R.layout.second_layout, null, false, component);
  }

  public static SecondLayoutBinding bind(@NonNull View view) {
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
  public static SecondLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (SecondLayoutBinding)bind(component, view, R.layout.second_layout);
  }
}