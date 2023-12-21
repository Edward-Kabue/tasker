

package com.ist.words.ui.bars

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.ist.words.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(
    actions: @Composable RowScope.() -> Unit = {}
) {
  TopAppBar(

    title = {
          Text(text = stringResource(id = R.string.app_name))
      }, actions = actions)
}