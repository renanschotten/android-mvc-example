package com.example.mvclogin.view

interface ILoginView {
    fun onLoginError(message: String)
    fun onLoginSuccess(message: String)
}