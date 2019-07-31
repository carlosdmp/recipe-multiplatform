package data.api

import kotlin.coroutines.*
import kotlinx.coroutines.*
import platform.darwin.*

internal class NsQueueDispatcher(
    private val dispatchQueue: dispatch_queue_t
) : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(dispatchQueue) {
            block.run()
        }
    }
}

internal actual val Main: CoroutineDispatcher = NsQueueDispatcher(dispatch_get_main_queue())

internal actual val Background: CoroutineDispatcher = Dispatchers.Default

