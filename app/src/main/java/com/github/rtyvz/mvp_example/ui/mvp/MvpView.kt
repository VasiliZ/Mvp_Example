package com.github.rtyvz.mvp_example.ui.mvp

import com.github.rtyvz.mvp_example.ui.base.Contract

interface MvpView : Contract.View {

    fun navigateToMvvmActivity()

    fun navigateToMoxyActivity()

}