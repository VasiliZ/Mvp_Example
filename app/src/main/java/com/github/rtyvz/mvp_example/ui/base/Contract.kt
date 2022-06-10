package com.github.rtyvz.mvp_example.ui.base

interface Contract {
    interface View
    interface Presenter<VIEW : View> {
        fun onAttach(view: View)
        fun onDetach()
    }
}