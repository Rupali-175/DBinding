package com.example.dbinding.kotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.dbinding.BR
import com.example.dbinding.R
import com.example.dbinding.databinding.SecondLayoutBinding
import com.example.dbinding.model.Product

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mBinding: SecondLayoutBinding = DataBindingUtil.setContentView(this, R.layout.second_layout)
        val mProduct = Product("prod name", "100")
        mBinding.setVariable(BR.product, mProduct)
    }
}