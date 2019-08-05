package domain.model

data class RecipesDisplay(
    val results: List<Result>,
    val title: String
) {
    data class Result(
        val title: String,
        val ingredients: String,
        val thumbnail: String
    )
}

object RecipesDisplayMapper {
    fun transform(recipes: Recipes): RecipesDisplay {
        return RecipesDisplay(
            title = recipes.title,
            results = recipes.results.map { result ->
                RecipesDisplay.Result(
                    title = result.title,
                    ingredients = result.ingredients,
                    thumbnail = result.thumbnail
                )
            }
        )
    }
}