package data.api

import domain.model.Recipes
import domain.model.RecipesEntity
import domain.model.RecipesEntityMapper
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

class RecipeApi {
    private val client = HttpClient()

    private var address = Url("http://www.recipepuppy.com/api/?i=onions,garlic&q=omelet")
    private var queryUrl = "http://www.recipepuppy.com/api/?q="

    suspend fun getRecipe(): RecipesEntity =
        Json(JsonConfiguration.Stable).let { json ->
            json.parse(RecipesEntity.serializer(), client.get {
                url(address.toString())
            })
        }

    suspend fun getRecipe(search: String): RecipesEntity =
        Json(JsonConfiguration.Stable).let { json ->
            json.parse(RecipesEntity.serializer(), client.get {
                url(queryUrl + search)
            })
        }
}