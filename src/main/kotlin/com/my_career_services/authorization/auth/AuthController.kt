package com.my_career_services.authorization.auth

import com.my_career_services.authorization.auth.dto.UserDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
    private val authService: AuthService
) {
    @GetMapping
    fun getAll(): List<UserDto> = authService.getAll()
}