package ru.ermolnik.news_impl.di

import dagger.Component
import ru.ermolnik.news_impl.ui.NewsViewModel
import javax.inject.Singleton

@Component(dependencies = [NewsFeatureDependencies::class], modules = [NewsModule::class])
@Singleton
internal interface NewsComponent : NewsFeatureApi {
    fun inject(viewModel: NewsViewModel)

    companion object {
        fun initAndGet(newsFeatureDependencies: NewsFeatureDependencies): NewsComponent {
            return DaggerNewsComponent.builder()
                .newsFeatureDependencies(newsFeatureDependencies)
                .build()
        }
    }
}