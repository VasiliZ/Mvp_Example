package com.github.rtyvz.mvp_example.ui.base

open class BasePresenter<V : MvpView> : MvpPresenter<V> {

    private var view: MvpView? = null

    override fun onAttach(view: V) {
        this.view = view
    }
}