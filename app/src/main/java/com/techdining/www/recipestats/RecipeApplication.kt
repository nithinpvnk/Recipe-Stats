package com.techdining.www.recipestats

import android.app.Application
import timber.log.Timber

class RecipeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}