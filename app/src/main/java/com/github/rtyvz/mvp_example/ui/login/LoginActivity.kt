package com.github.rtyvz.mvp_example.ui.login

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.github.rtyvz.mvp_example.R
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity(), LoginMvpView {

    private lateinit var userNameTextField: TextInputEditText
    private lateinit var passwordTextField: TextInputEditText
    private lateinit var loginButton: Button

    private var loginPresenter: LoginPresenter<LoginMvpView>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        loginPresenter = LoginPresenter()
        loginPresenter?.onAttach(this)

        loginButton.setOnClickListener {
            loginPresenter?.onLoginButtonClicked()
        }
    }

    private fun initViews() {
        userNameTextField = findViewById(R.id.userNameTextField)
        passwordTextField = findViewById(R.id.passwordTextField)
        loginButton = findViewById(R.id.loginButton)
    }
}