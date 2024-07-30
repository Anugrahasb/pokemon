package com.example.pokemon

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import java.util.Timer

@HiltAndroidApp
class PokeMonApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}