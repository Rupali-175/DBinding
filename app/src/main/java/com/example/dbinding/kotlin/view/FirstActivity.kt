package com.example.dbinding.kotlin.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.dbinding.BR
import com.example.dbinding.R
import com.example.dbinding.databinding.FirstLayoutBinding
import com.example.dbinding.model.Content

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: FirstLayoutBinding = DataBindingUtil.setContentView(this, R.layout.first_layout)

        val mContent = Content("Name3", "Price2", "Type2")
        binding.setVariable(BR.mcontent, mContent)
        //  binding.executePendingBindings()
    }

    fun navigate(v: View) {
        val navigateToSecond = Intent(this, SecondActivity::class.java)
        startActivity(navigateToSecond)
    }
}