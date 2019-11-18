
package com.example.dbinding.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.dbinding.BR;

public class Content extends BaseObservable {

    private String name;

    private String price;

    private String imageURL;

    private String type;

    public Content() {

    }

    public Content(String name, String price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.content);
    }

    @Bindable
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
       // notifyPropertyChanged(com.example.dbinding.BR.price);
    }

    @Bindable
    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
      //  notifyPropertyChanged(com.example.dbinding.BR.imageURL);
    }

    @Bindable
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
      //  notifyPropertyChanged(com.example.dbinding.BR.type);
    }

}
