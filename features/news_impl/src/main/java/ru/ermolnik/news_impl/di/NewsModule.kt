package ru.ermolnik.news_impl.di

import dagger.Binds
import dagger.Module
import ru.ermolnik.core_impl.PerFeature
import ru.ermolnik.news_impl.ui.NewsInteractorApi
import ru.ermolnik.news_impl.ui.NewsInteractorImpl
import javax.inject.Singleton

@Module
internal interface NewsModule {

    @Binds
    @Singleton
    fun provideNewsInteractor(interactor: NewsInteractorImpl): NewsInteractorApi
}