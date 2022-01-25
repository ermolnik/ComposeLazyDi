package ru.ermolnik.archapp.di

import ru.ermolnik.archapp.App
import ru.ermolnik.archapp.di.AppHolderInjector.appInjection
import ru.ermolnik.archapp.di.NewsHolderInjector.newsInjection

object DependencyHandler {
    fun initDependency(appContext: App) {
        appInjection(appContext)
        newsInjection()
    }
}