package domain.model

data class Recipes(
    val results: List<Result>,
    val title: String
) {
    data class Result(
        val title: String,
        val ingredients: String,
        val thumbnail: String
    )
}