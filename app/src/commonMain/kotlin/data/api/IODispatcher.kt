package data.api

import kotlinx.coroutines.CoroutineDispatcher

internal expect val BackgroundDispatcher: CoroutineDispatcher

internal expect val IODispatcher: CoroutineDispatcher

