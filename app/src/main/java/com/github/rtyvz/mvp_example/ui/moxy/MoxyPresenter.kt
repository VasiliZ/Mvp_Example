package com.github.rtyvz.mvp_example.ui.moxy

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MoxyPresenter : MvpPresenter<MoxyView>() {

    fun onMvvmButtonClick() {
        viewState.navigateToMvvmActivity()
    }

    fun onMvpButtonClick() {
        viewState.navigateToMvpActivity()
    }
}