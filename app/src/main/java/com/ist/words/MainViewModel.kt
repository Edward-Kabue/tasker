package com.ist.words

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.ist.words.data.words.RandomWords
import com.ist.words.data.words.Word


class MainViewModel(application: Application) : AndroidViewModel(application) {

    val words: List<Word> = RandomWords.map { Word(it) }

}
