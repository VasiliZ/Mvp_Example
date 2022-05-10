package com.github.rtyvz.mvp_example.ui.login

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.github.rtyvz.mvp_example.R
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity(), LoginView {

    private lateinit var userNameTextField: TextInputEditText
    private lateinit var passwordTextField: TextInputEditText
    private lateinit var loginButton: Button
    private lateinit var errorTextView: AppCompatTextView

    private var loginPresenter: LoginPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter()
        loginPresenter?.onAttach(this)

        initViews()

        loginButton.setOnClickListener {
            loginPresenter?.onLoginButtonClicked(
                userNameTextField.text.toString(),
                passwordTextField.text.toString()
            )
        }
    }

    private fun initViews() {
        userNameTextField = findViewById(R.id.userNameTextField)
        passwordTextField = findViewById(R.id.passwordTextField)
        loginButton = findViewById(R.id.loginButton)
        errorTextView = findViewById(R.id.errorTextView)
    }

    override fun setError(errorMessage: String?) {
        errorTextView.text = errorMessage
    }

    override fun getEmptyCredentialsError() =
        getString(R.string.main_activity_empty_credentials_error)
}