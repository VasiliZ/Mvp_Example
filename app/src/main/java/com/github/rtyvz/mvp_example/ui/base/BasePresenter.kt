package com.github.rtyvz.mvp_example.ui.base

abstract class BasePresenter<VIEW : Contract.View> : Contract.Presenter<VIEW> {

    private var _view: VIEW? = null
    protected val view
        get() = _view ?: throw Exception("view is null")

    override fun onAttach(view: Contract.View) {
        this._view = view as? VIEW ?: throw Exception("can't cast view")
    }

    override fun onDetach() {
        _view = null
    }
}