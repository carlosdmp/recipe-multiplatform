package data.api

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*

class RecipeApi {
    private val client = HttpClient()

    private var address = Url("http://www.recipepuppy.com/api/?i=onions,garlic&q=omelet")

    suspend fun getRecipe(): String {
        return client.get {
            url(address.toString())
        }
    }
}