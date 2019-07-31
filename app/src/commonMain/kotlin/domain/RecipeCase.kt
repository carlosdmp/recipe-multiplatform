package domain

import data.api.RecipeApi
import data.repo.RecipeRepo

class RecipeCase(private val recipeRepo: RecipeRepo) {
    suspend fun getRecipe(): String {
        return recipeRepo.getRecipe()
    }
}

object CaseProvider {
    fun getCase() = RecipeCase(RecipeRepo(RecipeApi()))
}