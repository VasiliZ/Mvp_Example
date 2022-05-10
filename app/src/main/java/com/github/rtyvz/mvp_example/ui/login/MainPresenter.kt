package com.github.rtyvz.mvp_example.ui.login

import com.github.rtyvz.mvp_example.ui.base.BasePresenter


class MainPresenter<V : MainMvpView> : BasePresenter<V>(), MainMvpPresenter<V> {

    override fun onLoginButtonClicked() {
        println("lock")
    }
}