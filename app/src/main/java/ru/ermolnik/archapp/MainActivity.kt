package ru.ermolnik.archapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import ru.ermolnik.archapp.ui.theme.ArchAppTheme
import ru.ermolnik.news_impl.ui.NewsScreen
import ru.ermolnik.news_impl.ui.NewsViewModel

internal class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: NewsViewModel by viewModels()

        setContent {
            ArchAppTheme {
                NewsScreen(viewModel)
            }
        }
    }
}