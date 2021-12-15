package com.andrew.accommodations.viewmodels.main

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.andrew.accommodations.data.repository.main.RepositoryMain

class ViewModelMain @ViewModelInject constructor(
    private val repository: RepositoryMain,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

}