package com.example.mvclogin.controller

import com.example.mvclogin.model.User
import com.example.mvclogin.view.ILoginView

class LoginController(var loginView: ILoginView) : ILoginController {
    override fun onLogin(email: String, password: String) {
        var user: User = User(email, password)
        var loginCode = user.isValid()
        when (loginCode) {
            0 -> loginView.onLoginError("Please enter Email")
            1 -> loginView.onLoginError("Please enter valid Email")
            2 -> loginView.onLoginError("Please enter Password")
            3 -> loginView.onLoginError("Please enter valid Password")
            else -> loginView.onLoginSuccess("Login Successful")
        }
    }
}