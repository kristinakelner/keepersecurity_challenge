package com.example.keepersecuritycodingtest.util

import org.junit.Assert.*

import org.junit.Test

class VerificationTest {

    //Password verification test
    @Test
    fun `empty password returns false`() {
        assertFalse(Verification().passwordVerify(""))
    }

    @Test
    fun `password with length less than MIN_PASSWORD_LENGTH returns false`() {
        assertFalse(Verification().passwordVerify("1234"))
    }

    @Test
    fun `password with length more or equal to MIN_PASSWORD_LENGTH returns true`() {
        assertTrue(Verification().passwordVerify("123456"))
    }


    //Email verification test
    @Test
    fun `empty email returns false`() {
        assertFalse(Verification().emailVerify(""))
    }

    @Test
    fun `email with invalid symbols returns false`() {
        assertFalse(Verification().emailVerify("abc def@dot.com"))
    }

    @Test
    fun `email without domain returns false`() {
        assertFalse(Verification().emailVerify("abc@"))
        assertFalse(Verification().emailVerify("abc"))
    }

    @Test
    fun `valid email returns true`() {
        assertTrue(Verification().emailVerify("abc@dot.com"))
    }
}