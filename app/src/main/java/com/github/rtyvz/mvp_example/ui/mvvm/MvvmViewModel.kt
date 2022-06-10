package com.github.rtyvz.mvp_example.ui.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MvvmViewModel : ViewModel() {

    val handleMvpButtonLiveData: MutableLiveData<Boolean> = MutableLiveData()
    val handleMoxyButtonLiveData: MutableLiveData<Boolean> = MutableLiveData()

    fun onMvpButtonClicked(isClicked: Boolean) {
        handleMvpButtonLiveData.value = isClicked
    }

    fun onMoxyButtonClicked(isClicked: Boolean) {
        handleMoxyButtonLiveData.value = isClicked
    }
}