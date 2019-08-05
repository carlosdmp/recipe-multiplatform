package data.model

import kotlinx.serialization.Serializable

@Serializable
data class RecipesEntity(
    val href: String,
    val results: List<Result>,
    val title: String,
    val version: Double
) {
    @Serializable
    data class Result(
        val href: String,
        val ingredients: String,
        val thumbnail: String,
        val title: String
    )
}