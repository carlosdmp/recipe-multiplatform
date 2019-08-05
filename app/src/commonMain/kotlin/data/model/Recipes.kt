package domain.model

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

object RecipesEntityMapper {
    fun transform(recipes: RecipesEntity): Recipes {
        return Recipes(
            title = recipes.title,
            results = recipes.results.map { result ->
                Recipes.Result(
                    title = result.title,
                    ingredients = result.ingredients,
                    thumbnail = result.thumbnail
                )
            }
        )
    }
}