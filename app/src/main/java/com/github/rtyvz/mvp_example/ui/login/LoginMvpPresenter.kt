package com.github.rtyvz.mvp_example.ui.login

import com.github.rtyvz.mvp_example.ui.base.MvpPresenter
import com.github.rtyvz.mvp_example.ui.base.MvpView

interface LoginMvpPresenter<V : MvpView> : MvpPresenter<V> {

    fun onLoginButtonClicked()
}