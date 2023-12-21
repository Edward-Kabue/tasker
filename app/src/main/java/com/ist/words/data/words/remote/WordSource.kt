package com.ist.words.data.words.remote

import com.ist.words.data.AppHttpClient
import com.ist.words.data.words.Word
import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WordSource(private val client: HttpClient = AppHttpClient) {

    suspend fun load(): List<Word> = withContext(Dispatchers.IO) {
        client.getRemoteWords()
            .lineSequence()
            .map { Word(it) }
            .toList()
    }

}

private suspend fun HttpClient.getRemoteWords(): String =
    get("https://pablisco.com/define/words").toString()