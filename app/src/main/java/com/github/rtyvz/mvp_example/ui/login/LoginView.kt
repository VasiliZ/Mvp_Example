package com.github.rtyvz.mvp_example.ui.login

import com.github.rtyvz.mvp_example.ui.base.Contract

interface LoginView : Contract.View {
    fun setError(errorMessage: String?)
    fun getEmptyCredentialsError(): String
}