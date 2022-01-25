package ru.ermolnik.news_impl.ui

import ru.ermolnik.core_impl.BaseViewModel
import ru.ermolnik.core_impl.PerFeature
import ru.ermolnik.news_api.NewsUiModel
import ru.ermolnik.news_impl.di.NewsComponentHolder
import javax.inject.Inject
import javax.inject.Singleton

class NewsViewModel:
    BaseViewModel<NewsViewState, NewsActions>(NewsViewState.Init) {

    @Inject
    lateinit var interactorApi: NewsInteractorApi

    init {
        NewsComponentHolder.getComponent().inject(this)
        setState(NewsViewState.Content(interactorApi.getNews()))
    }

    override fun onAction(actions: NewsActions) {
    }

}