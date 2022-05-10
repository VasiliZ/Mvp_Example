package com.github.rtyvz.mvp_example.ui.login

import com.github.rtyvz.mvp_example.ui.base.BasePresenter


class LoginPresenter<V : LoginMvpView> : BasePresenter<V>(), LoginMvpPresenter<V> {

    override fun onLoginButtonClicked() {
        println("lock")
    }
}