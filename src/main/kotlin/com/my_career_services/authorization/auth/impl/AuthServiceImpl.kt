package com.my_career_services.authorization.auth.impl

import com.my_career_services.authorization.auth.AuthService
import com.my_career_services.authorization.auth.dto.UserDto
import com.my_career_services.authorization.shared.CountryCode
import org.springframework.stereotype.Service

@Service
class AuthServiceImpl : AuthService {
    override fun getAll(): List<UserDto> {
        return listOf(
            UserDto(1, CountryCode.RUSSIA.code, "9516782912"),
            UserDto(2, CountryCode.RUSSIA.code, "9110325468"),
        )
    }
}