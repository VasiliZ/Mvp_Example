package com.github.rtyvz.mvp_example.ui.moxy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.github.rtyvz.mvp_example.R
import com.github.rtyvz.mvp_example.ui.mvp.MvpActivity
import com.github.rtyvz.mvp_example.ui.mvvm.MvvmActivity

class MoxyActivity : MvpAppCompatActivity(), MoxyView {

    @InjectPresenter
    lateinit var presenter: MoxyPresenter

    private lateinit var mvvmButton: Button
    private lateinit var mvpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_moxy)

        mvvmButton = findViewById(R.id.mvvmButton)
        mvpButton = findViewById(R.id.mvpButton)

        mvvmButton.setOnClickListener {
            presenter.onMvpButtonClick()
        }

        mvvmButton.setOnClickListener {
            presenter.onMvvmButtonClick()
        }
    }

    override fun navigateToMvvmActivity() {
        startActivity(Intent(this, MvvmActivity::class.java))
    }

    override fun navigateToMvpActivity() {
        startActivity(Intent(this, MvpActivity::class.java))
    }
}