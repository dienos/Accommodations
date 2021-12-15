package com.andrew.accommodations.views.main

import androidx.activity.viewModels
import com.andrew.accommodations.R
import com.andrew.accommodations.base.BaseBindingActivity
import com.andrew.accommodations.databinding.ActivityMainBinding
import com.andrew.accommodations.viewmodels.main.ViewModelMain
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ActivityMain : BaseBindingActivity<ActivityMainBinding>() {
    private val viewModel: ViewModelMain by viewModels()

    override fun getLayoutResId(): Int = R.layout.activity_main

    override fun initializeViewModel() {
        binding.apply {
            lifecycleOwner = this@ActivityMain
            vm = viewModel
        }
    }

    override fun initializeEventObserver() {
    }
}