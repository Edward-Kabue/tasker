
package com.ist.words.ui.icons

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import com.ist.words.ui.theme.WordsColors


@Composable
fun BackIcon(onClick: () -> Unit) {
  IconButton(
      onClick = onClick,
      content = {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "back",
            tint = WordsColors.salem,
        )
      },
  )
}

