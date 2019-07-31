package presentation

data class RecipeState(val s: String)

interface RecipeView {
    fun showState(state: RecipeState)
}