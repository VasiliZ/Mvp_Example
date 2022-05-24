package com.github.rtyvz.mvp_example.ui.mvp

import com.github.rtyvz.mvp_example.ui.base.Contract

interface MvpPresenter<V : Contract.View> : Contract.Presenter<V> {

    fun onMoxyButtonClicked()

    fun onMvvmButtonClicked()
}