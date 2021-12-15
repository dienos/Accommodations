package com.andrew.accommodations.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseBindingActivity<T : ViewDataBinding> : AppCompatActivity() {
    @LayoutRes
    abstract fun getLayoutResId(): Int
    abstract fun initializeViewModel()
    abstract fun initializeEventObserver()

    lateinit var binding: T
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutResId())
        initializeViewModel()
        initializeEventObserver()
    }
}