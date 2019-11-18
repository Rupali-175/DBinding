package com.example.dbinding.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.dbinding.R;
import com.example.dbinding.databinding.ActivityMainBinding;
import com.example.dbinding.presenter.ContentPresenter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ContentPresenter mPresenter = new ContentPresenter();
        binding.setPresenter(mPresenter);
    }
}
