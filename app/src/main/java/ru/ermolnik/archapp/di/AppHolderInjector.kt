package ru.ermolnik.archapp.di

import ru.ermolnik.archapp.App
import ru.ermolnik.module_injector.BaseDependencyHolder
import ru.ermolnik.module_injector.BaseFeatureDependencies
import ru.ermolnik.module_injector.DependencyHolder0

object AppHolderInjector {
    fun appInjection(appContext: App) {
        AppComponentHolder.dependencyProvider = {
            class AppComponentDependencyHolder(
                override val block: (BaseDependencyHolder<AppFeatureDependencies>) -> AppFeatureDependencies
            ) : DependencyHolder0<AppFeatureDependencies>()

            AppComponentDependencyHolder { deps ->
                object : AppFeatureDependencies {
                    override val appProvider: ApplicationProviderApi =
                        ApplicationProviderImpl(appContext)
                    override val dependencyHolder: BaseDependencyHolder<out BaseFeatureDependencies> = deps
                }
            }.dependencies
        }
    }
}