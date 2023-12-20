

package com.ist.android.words.ui.bars

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.words.R


@Composable
fun MainTopBar(
    actions: @Composable RowScope.() -> Unit = {}
) {
  TopAppBar(
      elevation = 4.dp,
      title = {
        Text(text = stringResource(id = R.string.app_name))
      },
      actions = actions
  )
}