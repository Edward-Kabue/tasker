package com.ist.words.data.words

import com.ist.words.data.words.remote.WordSource

class WordRepository (
    private val wordSource: WordSource = WordSource(),) {
    suspend fun allWords(): List<Word> = wordSource.load()
    }
