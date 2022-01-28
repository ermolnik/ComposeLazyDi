package ru.ermolnik.archapp

import android.app.Application
import ru.ermolnik.archapp.di.DependencyHandler

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DependencyHandler.initDependency(this)
    }
}