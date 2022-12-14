package com.my_career_services.authorization.auth

import com.my_career_services.authorization.auth.dto.UserDto

interface AuthService {
    fun getAll(): List<UserDto>
}