package com.example.mvclogin.model

import android.util.Patterns

class User(private var email: String, private var password: String) : IUser {
    override fun getEmail(): String {
        return email
    }

    override fun getPassword(): String {
        return password
    }

    override fun isValid(): Int {
        if (getEmail().isEmpty()) return 0
        if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) return 1
        if (getPassword().isEmpty()) return 2
        if (getPassword().length <= 6) return 3

        return -1

    }
}