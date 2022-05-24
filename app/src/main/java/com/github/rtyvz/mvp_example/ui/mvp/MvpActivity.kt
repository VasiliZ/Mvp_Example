package com.github.rtyvz.mvp_example.ui.mvp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.github.rtyvz.mvp_example.R
import com.github.rtyvz.mvp_example.ui.moxy.MoxyActivity
import com.github.rtyvz.mvp_example.ui.mvvm.MvvmActivity

class MvpActivity : AppCompatActivity(), MvpView {

    private lateinit var moxyButton: Button
    private lateinit var mvvmButton: Button

    private var loginMvpPresenterImpl: MvpPresenterImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        loginMvpPresenterImpl = MvpPresenterImpl()
        loginMvpPresenterImpl?.onAttach(this)

        initViews()

        moxyButton.setOnClickListener {
            loginMvpPresenterImpl?.onMoxyButtonClicked()
        }

        mvvmButton.setOnClickListener {
            loginMvpPresenterImpl?.onMvvmButtonClicked()
        }
    }

    private fun initViews() {
        mvvmButton = findViewById(R.id.mvvmButton)
        moxyButton = findViewById(R.id.moxyButton)
    }

    override fun navigateToMvvmActivity() {
        startActivity(Intent(this, MvvmActivity::class.java))
    }

    override fun navigateToMoxyActivity() {
        startActivity(Intent(this, MoxyActivity::class.java))
    }
}