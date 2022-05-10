package com.github.rtyvz.mvp_example.ui.login

import com.github.rtyvz.mvp_example.ui.base.Contract

interface LoginMvpPresenter<V : Contract.View> : Contract.Presenter<V> {

    fun onLoginButtonClicked(userName: String, password: String)
}