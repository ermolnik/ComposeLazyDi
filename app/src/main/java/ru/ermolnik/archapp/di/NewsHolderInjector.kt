package ru.ermolnik.archapp.di

import ru.ermolnik.module_injector.BaseDependencyHolder
import ru.ermolnik.module_injector.BaseFeatureDependencies
import ru.ermolnik.module_injector.DependencyHolder1
import ru.ermolnik.news_impl.di.NewsComponentHolder
import ru.ermolnik.news_impl.di.NewsFeatureDependencies

object NewsHolderInjector {
    fun newsInjection() {
        NewsComponentHolder.dependencyProvider = {
            class OnboardingComponentDependencyHolder(
                override val block: (BaseDependencyHolder<NewsFeatureDependencies>, api1: AppFeatureApi) -> NewsFeatureDependencies
            ) : DependencyHolder1<AppFeatureApi, NewsFeatureDependencies>(api1 = AppComponentHolder.get())

            OnboardingComponentDependencyHolder { dependencyHolder, appApi ->
                object : NewsFeatureDependencies {
                    override val dependencyHolder: BaseDependencyHolder<out BaseFeatureDependencies> =
                        dependencyHolder
                }
            }.dependencies
        }
    }
}