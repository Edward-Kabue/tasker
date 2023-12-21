

package com.raywenderlich.android.words.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ist.words.ui.bars.MainTopBar


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoadingUi() {
  Scaffold(
      topBar = { MainTopBar() },
      content = { LoadingIndicator() },
  )
}

@Composable
fun LoadingIndicator() {
  Box(
      modifier = Modifier.fillMaxSize(),
      contentAlignment = Alignment.Center
  ) {
    CircularProgressIndicator()
  }
}
