package com.techdining.www.recipestats.viewModel

import androidx.lifecycle.ViewModel
import timber.log.Timber

class RecipeHomeViewModel : ViewModel() {
    init {
        Timber.i("Recipe Homepage ViewModel is created")
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("Recipe Homepage ViewModel is Destroyed")
    }
}