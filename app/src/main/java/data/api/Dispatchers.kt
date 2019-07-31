package data.api

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal actual val Background: CoroutineDispatcher = Dispatchers.Default

internal actual val Main: CoroutineDispatcher = Dispatchers.Main