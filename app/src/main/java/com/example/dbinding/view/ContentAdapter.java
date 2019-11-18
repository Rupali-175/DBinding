package com.example.dbinding.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbinding.R;
import com.example.dbinding.databinding.ItemRowBinding;
import com.example.dbinding.model.Content;

import java.util.ArrayList;
import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {
    List<Content> mContents;
    LayoutInflater inflater;

    public ContentAdapter() {
        this.mContents = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (inflater == null) {
            inflater = LayoutInflater.from(parent.getContext());
        }
        ItemRowBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.item_row, parent, false);
        return new ViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Content mContent = mContents.get(position);
        holder.itemView.setContent(mContent);
    }

    @Override
    public int getItemCount() {
        return mContents.size();
    }

    public void updateData(List<Content> mContents) {
        if (mContents == null || mContents.isEmpty()) {
            this.mContents.clear();
        } else {
            this.mContents.addAll(mContents);
        }
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRowBinding itemView;

        public ViewHolder(@NonNull ItemRowBinding itemView) {
            super(itemView.getRoot());
            this.itemView = itemView;
        }


    }
}

