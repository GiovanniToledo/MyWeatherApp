package com.gtoledo.myweatherapp

import android.util.Patterns

fun isValidEmail(email: String): Boolean {
    return email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
}