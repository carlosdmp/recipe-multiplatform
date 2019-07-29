package data.model

data class RecipesEntity(
    val href: String,
    val results: List<Result>,
    val title: String,
    val version: Double
) {
    data class Result(
        val href: String,
        val ingredients: String,
        val thumbnail: String,
        val title: String
    )
}