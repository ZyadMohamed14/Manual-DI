package com.example.diwithclean.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.diwithclean.MyApplication
import com.example.diwithclean.R
import com.example.diwithclean.presentation.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appContainer = (application as MyApplication).container
        myViewModel = ViewModelProvider(this,appContainer.loginViewModelFactory).get(
            MyViewModel::class.java)

    }
}