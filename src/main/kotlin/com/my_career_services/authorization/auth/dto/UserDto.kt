package com.my_career_services.authorization.auth.dto

import com.my_career_services.authorization.shared.Id

data class UserDto(
    val id: Id,
    val countryCode: Int,
    val phoneNumber: String,
)