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

        viewModel.liveData.observe(this) {
            if (it == 0) {
                navigateToMoxyActivity()
            } else {
                navigateToMvpActivity()
            }
        }

        mvpButton = findViewById(R.id.mvvmButton)
        moxyButton = findViewById(R.id.moxyButton)

        mvpButton.setOnClickListener {
            viewModel.setLiveDataValue(1)
        }

        moxyButton.setOnClickListener {
            viewModel.setLiveDataValue(2)
        }
    }

    private fun navigateToMvpActivity() {
        startActivity(Intent(this, MvpActivity::class.java))
    }

    private fun navigateToMoxyActivity() {
        startActivity(Intent(this, MoxyActivity::class.java))
    }
}