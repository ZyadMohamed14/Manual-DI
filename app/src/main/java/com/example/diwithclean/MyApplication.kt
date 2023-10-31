package com.example.diwithclean

import android.app.Application
import com.example.diwithclean.presentation.Container

class MyApplication:Application(){
    val container= Container()
    override fun onCreate() {
        super.onCreate()

    }
}