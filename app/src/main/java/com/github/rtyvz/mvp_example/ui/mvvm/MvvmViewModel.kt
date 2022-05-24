package com.github.rtyvz.mvp_example.ui.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MvvmViewModel : ViewModel() {

    val liveData: MutableLiveData<Int> = MutableLiveData()

    fun setLiveDataValue(value: Int) {
        liveData.value = value
    }
}