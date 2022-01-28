package ru.ermolnik.news_impl.ui

import ru.ermolnik.news_api.NewsUiModel
import javax.inject.Inject
import javax.inject.Singleton

interface NewsInteractorApi {
    fun getNews(): List<NewsUiModel>
}

@Singleton
class NewsInteractorImpl @Inject constructor() : NewsInteractorApi {

    override fun getNews(): List<NewsUiModel> {
        return listOf(
            NewsUiModel("News title", "News subtitle"),
            NewsUiModel("News title", "News subtitle"),
            NewsUiModel("News title", "News subtitle"),
            NewsUiModel("News title", "News subtitle"),
            NewsUiModel("News title", "News subtitle"),
        )
    }
}