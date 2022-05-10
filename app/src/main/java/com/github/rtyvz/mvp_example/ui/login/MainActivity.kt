package com.github.rtyvz.mvp_example.ui.login

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.github.rtyvz.mvp_example.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(), MainMvpView {

    private lateinit var userNameTextField: TextInputEditText
    private lateinit var passwordTextField: TextInputEditText
    private lateinit var loginButton: Button

    private var mainPresenter: MainPresenter<MainMvpView>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        mainPresenter = MainPresenter()
        mainPresenter?.onAttach(this)

        loginButton.setOnClickListener {
            mainPresenter?.onLoginButtonClicked()
        }
    }

    private fun initViews() {
        userNameTextField = findViewById(R.id.userNameTextField)
        passwordTextField = findViewById(R.id.passwordTextField)
        loginButton = findViewById(R.id.loginButton)
    }
}