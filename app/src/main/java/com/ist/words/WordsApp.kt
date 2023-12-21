package com.ist.words

import android.app.Application
import com.ist.words.data.words.WordRepository

class WordsApp : Application() {
    val wordRepository by lazy { WordRepository() }


}