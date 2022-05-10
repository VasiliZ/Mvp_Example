package com.github.rtyvz.mvp_example.ui.base

interface MvpPresenter<V : MvpView> {

    fun onAttach(view: V)
}