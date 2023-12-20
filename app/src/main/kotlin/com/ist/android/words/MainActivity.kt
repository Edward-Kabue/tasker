

package com.ist.android.words

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.ist.android.words.ui.WordListUi
import com.ist.android.words.ui.theme.WordsTheme


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      WordsTheme {
        WordListUi()
    }
  }

}
