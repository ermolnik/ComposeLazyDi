package ru.ermolnik.news_impl.di

import ru.ermolnik.module_injector.BaseFeatureAPI
import ru.ermolnik.module_injector.BaseFeatureDependencies
import ru.ermolnik.module_injector.ComponentHolder
import ru.ermolnik.module_injector.ComponentHolderDelegate
import ru.ermolnik.news_impl.NewsRepositoryApi
import ru.ermolnik.news_impl.ui.NewsInteractorApi

object NewsComponentHolder : ComponentHolder<NewsFeatureApi, NewsFeatureDependencies> {
    private val componentHolderDelegate = ComponentHolderDelegate<
            NewsFeatureApi,
            NewsFeatureDependencies,
            NewsComponent> { dependencies: NewsFeatureDependencies ->
        NewsComponent.initAndGet(dependencies)
    }

    internal fun getComponent(): NewsComponent = componentHolderDelegate.getComponentImpl()

    override var dependencyProvider: (() -> NewsFeatureDependencies)? by componentHolderDelegate::dependencyProvider

    override fun get(): NewsFeatureApi = componentHolderDelegate.get()
}

interface NewsFeatureDependencies : BaseFeatureDependencies

interface NewsFeatureApi : BaseFeatureAPI