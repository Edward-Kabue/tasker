package com.ist.words.data.words.remote

import com.ist.words.data.AppHttpClient
import com.ist.words.data.words.Word
import io.ktor.client.HttpClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// 1
class WordSource(private val client: HttpClient = AppHttpClient) {                           // 2
    suspend fun load(): List<Word> = withContext(Dispatchers.IO) {
        client.getRemoteWords()
            .lineSequence()
            .map { Word(it) }
            .toList()
    }
}
