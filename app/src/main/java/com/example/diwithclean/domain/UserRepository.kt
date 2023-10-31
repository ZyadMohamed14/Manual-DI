package com.example.diwithclean.domain

import com.example.diwithclean.data.network.local.LocalDataSource
import com.example.diwithclean.data.network.remote.RemoteDataSource

class UserRepository(private val localDataSource: LocalDataSource,
                     private val remoteDataSource: RemoteDataSource
) {
}
