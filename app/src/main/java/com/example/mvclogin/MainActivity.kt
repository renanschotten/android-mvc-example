package com.example.mvclogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.mvclogin.controller.LoginController
import com.example.mvclogin.view.ILoginView

class MainActivity : AppCompatActivity(), ILoginView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)
        var loginB = findViewById<Button>(R.id.loginButton)
        var loginPresenter = LoginController(this)

        loginB.setOnClickListener {
            println(email.text.toString())
            println(password.text.toString())
            loginPresenter.onLogin(email.text.toString(), password.text.toString())
        }
    }

    override fun onLoginError(message: String) {
        showToast(message).show()
    }

    override fun onLoginSuccess(message: String) {
        showToast(message).show()
    }

    private fun showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT)
}