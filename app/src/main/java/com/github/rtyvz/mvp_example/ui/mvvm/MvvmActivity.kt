package com.github.rtyvz.mvp_example.ui.mvvm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.github.rtyvz.mvp_example.R
import com.github.rtyvz.mvp_example.ui.moxy.MoxyActivity
import com.github.rtyvz.mvp_example.ui.mvp.MvpActivity

class MvvmActivity : AppCompatActivity() {

    private lateinit var mvpButton: Button
    private lateinit var moxyButton: Button

    private lateinit var viewModel: MvvmViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_mvvm)

        viewModel = ViewModelProvider(this).get(MvvmViewModel::class.java)

        mvpButton = findViewById(R.id.mvvmButton)
        moxyButton = findViewById(R.id.moxyButton)

        viewModel.handleMvpButtonLiveData.observe(this) {
            navigateToMvpActivity()
        }

        viewModel.handleMoxyButtonLiveData.observe(this) {
            navigateToMoxyActivity()
        }

        mvpButton.setOnClickListener {
            viewModel.onMvpButtonClicked(true)
        }

        moxyButton.setOnClickListener {
            viewModel.onMoxyButtonClicked(true)
        }
    }

    private fun navigateToMvpActivity() {
        startActivity(Intent(this, MvpActivity::class.java))
    }

    private fun navigateToMoxyActivity() {
        startActivity(Intent(this, MoxyActivity::class.java))
    }
}