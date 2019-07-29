package data.model

import data.api.IODispatcher
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.*


class RecipeApi {
    private val client = HttpClient()

    private var address = Url("https://tools.ietf.org/rfc/rfc1866.txt")

    fun about(callback: (String) -> Unit) {
        GlobalScope.apply {
            launch(IODispatcher) {
                val result: String = client.get {
                    url(this@RecipeApi.address.toString())
                }
                callback(result)
            }
        }
    }
}