package data.api

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal actual val BackgroundDispatcher: CoroutineDispatcher = Dispatchers.Default

internal actual val IODispatcher: CoroutineDispatcher = Dispatchers.IO