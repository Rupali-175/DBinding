package com.example.dbinding.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Product extends BaseObservable {
    String mProdutName;
    String mProductPrice;

    public Product(String mProdutName, String mProductPrice) {
        this.mProdutName = mProdutName;
        this.mProductPrice = mProductPrice;
    }

    @Bindable
    public String getmProdutName() {
        return mProdutName;
    }

    public void setmProdutName(String mProdutName) {
        this.mProdutName = mProdutName;
        notifyPropertyChanged(com.example.dbinding.BR.mProdutName);
    }

    @Bindable
    public String getmProductPrice() {
        return mProductPrice;
    }

    public void setmProductPrice(String mProductPrice) {
        this.mProductPrice = mProductPrice;
        notifyPropertyChanged(com.example.dbinding.BR.mProductPrice);
    }
}
