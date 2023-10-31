package com.example.diwithclean.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.diwithclean.domain.UserRepository


class MyViewModelFactory(private val userRepository: UserRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)) {
            // Changing userRepository to match the LoginViewModel's parameter type
            // This way, we can create a LoginViewModel instance without casting
            return MyViewModel(userRepository) as T
        }
        // Handle other ViewModel types here
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
/*
override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MyViewModel(FetchData(dataRepository)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
 */
/*
override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(userRepository) as T
    }
 */