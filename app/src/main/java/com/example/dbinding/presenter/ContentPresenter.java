package com.example.dbinding.presenter;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbinding.BR;
import com.example.dbinding.model.Content;
import com.example.dbinding.repository.ProductRepository;
import com.example.dbinding.view.ContentAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContentPresenter extends BaseObservable {
    private List<Content> mContents;
    private ContentAdapter adapter;

    public ContentPresenter() {
        mContents = new ArrayList<>();
        adapter = new ContentAdapter();
        mContents = new ProductRepository().getContentList();
    }

    @BindingAdapter({"app:adapter", "app:data"})
    public static void bind(RecyclerView rv, ContentAdapter mAdapter, List<Content> data) {
        rv.setAdapter(mAdapter);
        mAdapter.updateData(data);
    }

    @Bindable
    public List<Content> getData() {
        return this.mContents;
    }

    @Bindable
    public ContentAdapter getAdapter() {
        return this.adapter;
    }


    public void getContent(View v) {
        mContents.addAll(new ProductRepository().getContentList());
        notifyPropertyChanged(BR.content);
    }


}
