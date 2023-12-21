/**
 * This file contains the implementation of the WordListUi composable function, which is responsible for rendering the UI for displaying a list of words.
 * It also includes supporting functions like WordColumnItem and WordsContent.
 * The WordListUi composable function is used within the Scaffold composable to provide the overall structure of the UI, including the top bar and the content area.
 * The WordsContent composable function is used to render the actual list of words using a LazyColumn, which allows for efficient scrolling of large lists.
 * The WordColumnItem composable function represents an individual item in the word list, displaying the word value and handling click events.
 */
package com.ist.words.ui

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ist.words.data.words.RandomWords
import com.ist.words.data.words.Word
import com.ist.words.ui.bars.MainTopBar

/**
 * Composable function that represents the UI for displaying a list of words.
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun WordListUi(words: List<Word>) {
    Scaffold(
        topBar = { MainTopBar() },
        content = {
            WordsContent(
                words = words,
                onSelected = { word -> Log.e("WordsContent",
                    "Selected: $word") }
            )

        }
    )
}
/**
 * Composable function that represents a single item in the word column.
 *
 * @param word The Word object representing the item.
 * @param onClick The callback function to be invoked when the item is clicked.
 */
@Composable
private fun WordColumnItem(
    word: Word,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier.clickable { onClick() },
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = word.value,
        )
    }
}

/**
 * Composable function that displays a list of words.
 *
 * @param words The list of words to be displayed.
 * @param onSelected The callback function to be invoked when a word is selected.
 */
@Composable
private fun WordsContent(
    words: List<Word>,
    onSelected: (Word) -> Unit,
) {
    LazyColumn {
        items(words) { word ->
            WordColumnItem(
                word = word
            ) { onSelected(word) }
        }
    }
}

