package com.ray.zawadimart.repository

import com.ray.zawadimart.data.UserDao
import com.ray.zawadimart.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}