package com.ist.android.words.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ist.android.words.data.words.Word
import com.ist.android.words.ui.bars.MainTopBar

@Composable
fun WordListUi() {
    Scaffold(
        topBar = { MainTopBar() },
        content = {

        }
    )
}
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
