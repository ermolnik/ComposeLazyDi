package ru.ermolnik.archapp.di

import ru.ermolnik.module_injector.BaseFeatureAPI
import ru.ermolnik.module_injector.BaseFeatureDependencies
import ru.ermolnik.module_injector.ComponentHolder
import ru.ermolnik.module_injector.ComponentHolderDelegate

object AppComponentHolder : ComponentHolder<AppFeatureApi, AppFeatureDependencies> {
    private val componentHolderDelegate = ComponentHolderDelegate<
            AppFeatureApi,
            AppFeatureDependencies,
            AppComponent> {
        AppComponent.initAndGet(it)
    }

    internal fun getComponent(): AppComponent = componentHolderDelegate.getComponentImpl()

    override var dependencyProvider: (() -> AppFeatureDependencies)? by componentHolderDelegate::dependencyProvider

    override fun get(): AppFeatureApi {
        return getComponent()
    }
}

interface AppFeatureApi : BaseFeatureAPI {
    val logger: Logger
}

interface AppFeatureDependencies : BaseFeatureDependencies {
    val appProvider: ApplicationProviderApi
}