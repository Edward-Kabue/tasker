package com.ist.words

import android.app.Application
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.ist.words.data.words.Word
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val wordRepository = getApplication<WordsApp>().wordRepository
    private val _words = mutableStateOf(emptyList<Word>())
    val words: State<List<Word>> = _words
    fun load() = effect {
        _words.value = wordRepository.allWords()
    }
    private fun effect(block: suspend () -> Unit) {
        viewModelScope.launch(Dispatchers.IO) { block() }
    }
}

