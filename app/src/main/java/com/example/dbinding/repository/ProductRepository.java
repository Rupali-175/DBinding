package com.example.dbinding.repository;

import android.content.Context;

import com.example.dbinding.model.Content;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<Content> getContentList() {
        List<Content> mContents = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            Content mContent = new Content();
            mContent.setName("Name " + i);
            mContent.setPrice("price " + i);
            mContent.setType("");
            mContents.add(mContent);
        }
        return mContents;
    }
}
