package com.ist.words

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.ist.words.data.words.Word
import kotlinx.coroutines.runBlocking


class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val wordRepository =
        getApplication<WordsApp>().wordRepository
    val words: List<Word> = runBlocking { wordRepository.allWords() }


}
