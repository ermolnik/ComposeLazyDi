package ru.ermolnik.news_impl.ui

import androidx.compose.runtime.Immutable
import ru.ermolnik.core_impl.UiState
import ru.ermolnik.news_api.NewsUiModel

@Immutable
sealed class NewsViewState: UiState {
    object Init: NewsViewState()
    object Loading: NewsViewState()
    data class Content(val news: List<NewsUiModel>): NewsViewState()
    data class Error(val exception: Exception) : NewsViewState()

    val data: Content?
        get() = this as? Content
}