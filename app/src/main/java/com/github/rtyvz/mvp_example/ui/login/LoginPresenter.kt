package com.github.rtyvz.mvp_example.ui.login

import com.github.rtyvz.mvp_example.ui.base.BasePresenter

class LoginPresenter : BasePresenter<LoginView>(), LoginMvpPresenter<LoginView> {

    override fun onLoginButtonClicked(userName: String, password: String) {
        if (userName.isBlank() || password.isBlank()) {
            with(view) {
                setError(getEmptyCredentialsError())
            }
        }
    }
}