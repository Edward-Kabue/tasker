
package com.ist.words.ui.icons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import com.ist.words.ui.theme.WordsColors


@Composable
fun SearchIcon(onClick: () -> Unit) {
  IconButton(
      onClick = onClick,
      content = {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "search",
            tint = WordsColors.salem,
        )
      },
  )
}