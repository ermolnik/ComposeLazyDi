package ru.ermolnik.news_impl.ui

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ru.ermolnik.news_api.NewsUiModel

@Composable
fun NewsScreen(viewModel: NewsViewModel) {

    val state = viewModel.state.collectAsState()
    val activity = (LocalContext.current) as ComponentActivity

    Scaffold {
        LazyColumn {
            state.value.data?.news?.let {
                items(it) { news ->
                    NewsViewItem(news){
                        Toast.makeText(activity, it.toString(), Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }
}

@Composable
internal fun NewsViewItem(newsItem: NewsUiModel, onClick: (NewsUiModel) -> Unit) {
    Column(Modifier.clickable { onClick(newsItem) }) {
        Spacer(modifier = Modifier.padding(4.dp))
        Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceAround) {
            Text(newsItem.title, textAlign = TextAlign.Center)
            Text(newsItem.subTitle, textAlign = TextAlign.Center)
        }
        Spacer(modifier = Modifier.padding(4.dp))
    }
}