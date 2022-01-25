package ru.ermolnik.news_impl.ui

import androidx.activity.ComponentActivity
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import ru.ermolnik.news_impl.di.NewsComponent
import ru.ermolnik.news_impl.di.NewsComponentHolder

@Composable
fun NewsScreen(viewModel: NewsViewModel) {

    val state = viewModel.state.collectAsState()

    Scaffold(
    ) {
        Text(text = state.value.data?.news?.firstOrNull()?.title.toString())
    }

}