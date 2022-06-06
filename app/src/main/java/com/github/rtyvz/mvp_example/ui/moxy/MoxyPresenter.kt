package com.github.rtyvz.mvp_example.ui.moxy

import com.arellomobile.mvp.InjectViewState

@InjectViewState
class MoxyPresenter : com.arellomobile.mvp.MvpPresenter<MoxyView>() {

    fun onMvvmButtonClick() {
        viewState.navigateToMvvmActivity()
    }

    fun onMvpButtonClick() {
        viewState.navigateToMvpActivity()
    }
}