
package com.ist.words.ui.bars

import androidx.activity.compose.BackHandler
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.ist.words.ui.icons.BackIcon
import com.ist.words.ui.icons.SearchIcon
import com.ist.words.ui.text.SearchTextField


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    search: String?,
    onSearch: (String?) -> Unit,
) {
  when (search) {
    null -> MainTopBar(
        actions = { SearchIcon { onSearch("") } }
    )
    else -> TopAppBar(
        title = {
          SearchTextField(search, onSearch)
        },
        navigationIcon = {
          BackHandler { onSearch(null) }
          BackIcon { onSearch(null) }
        },
        colors = TopAppBarDefaults.topAppBarColors()
    )
  }
}
