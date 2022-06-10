package com.github.rtyvz.mvp_example.ui.mvp

import com.github.rtyvz.mvp_example.ui.base.BasePresenter

class MvpPresenterImpl : BasePresenter<MvpView>(), MvpPresenter<MvpView> {

    override fun onMoxyButtonClicked() {
        view.navigateToMoxyActivity()
    }

    override fun onMvvmButtonClicked() {
        view.navigateToMvvmActivity()
    }


}