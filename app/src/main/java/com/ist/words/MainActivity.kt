package com.ist.words

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import com.ist.words.ui.WordListUi
import com.ist.words.ui.theme.WordsTheme


class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.load()
        setContent {
            val words by viewModel.words
            WordsTheme {
                WordListUi(words = words)
            }
        }

    }
}

