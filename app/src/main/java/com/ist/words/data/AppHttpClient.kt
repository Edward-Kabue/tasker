package com.ist.words.data

import io.ktor.client.HttpClient


val AppHttpClient: HttpClient by lazy {
    HttpClient()
}
