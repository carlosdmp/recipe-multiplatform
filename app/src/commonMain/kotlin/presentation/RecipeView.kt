package presentation

import domain.model.RecipesDisplay

data class RecipeState(val recipes: RecipesDisplay)

interface RecipeView {
    fun showState(state: RecipeState)
}