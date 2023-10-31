package com.example.diwithclean.presentation

import com.example.diwithclean.domain.UserRepository
import com.example.diwithclean.data.network.local.LocalDataSource
import com.example.diwithclean.data.network.remote.LoginService
import com.example.diwithclean.data.network.remote.RemoteDataSource
import retrofit2.Retrofit

class Container {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://example.com")
        .build()
        .create(LoginService::class.java)

    private val remoteDataSource = RemoteDataSource(retrofit)
    private val localDataSource = LocalDataSource()

    val userRepository = UserRepository(localDataSource, remoteDataSource)

    val loginViewModelFactory = MyViewModelFactory(userRepository)
    // Initialize your ViewModelProvider instance
   // val viewModelProvider = ViewModelProvider(this, loginViewModelFactory)
}