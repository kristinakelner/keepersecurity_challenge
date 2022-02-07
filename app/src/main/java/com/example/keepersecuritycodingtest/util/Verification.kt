package com.example.keepersecuritycodingtest.util

class Verification {

    private val MIN_PASSWORD_LENGTH = 6
    private val EMAIL_REGEXP = Regex("^[a-zA-Z0-9.!#\$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*\$")


    fun passwordVerify(password: String): Boolean {
        return password.length >= MIN_PASSWORD_LENGTH
    }

    fun emailVerify(email: String): Boolean {
        return email.matches(EMAIL_REGEXP)
    }

}