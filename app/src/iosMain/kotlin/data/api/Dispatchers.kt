package data.api

import kotlin.coroutines.*
import kotlinx.coroutines.*
import platform.darwin.*

class UI : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        val queue = dispatch_get_main_queue()
        dispatch_async(queue) {
            block.run()
        }
    }
}

internal actual val Main: CoroutineDispatcher = UI()

internal actual val Background: CoroutineDispatcher = Dispatchers.Default

