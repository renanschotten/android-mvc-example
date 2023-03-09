package com.example.mvclogin.model

interface IUser {
    fun getEmail(): String
    fun getPassword(): String
    fun isValid(): Int
}