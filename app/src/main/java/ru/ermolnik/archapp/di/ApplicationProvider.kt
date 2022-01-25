package ru.ermolnik.archapp.di

import android.content.Context
import ru.ermolnik.archapp.App

interface ApplicationProviderApi {

    /**
     * @returns application context
     */
    val applicationContext: Context
}

class ApplicationProviderImpl(private val app: App) : ApplicationProviderApi {

    override val applicationContext: Context
        get() = app.applicationContext
}