package data.api

import data.model.RecipesEntity
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

class RecipeApi {
    private val client = HttpClient()

    private var address = Url("http://www.recipepuppy.com/api/?i=onions,garlic&q=omelet")

    suspend fun getRecipe(): String {
        val json = Json(JsonConfiguration.Stable)
        return json.parse(RecipesEntity.serializer(), client.get {
            url(address.toString())
        }).toString()
    }
}