package com.example.mvclogin.controller

interface ILoginController {
    fun onLogin(email: String, password: String)
}