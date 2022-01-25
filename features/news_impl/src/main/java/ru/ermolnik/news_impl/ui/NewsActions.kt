package ru.ermolnik.news_impl.ui

import ru.ermolnik.core_impl.UiAction

sealed class NewsActions: UiAction {
    object OnBack: NewsActions()
    data class OnDetails(val newsId: Int): NewsActions()
}