package domain

import data.api.IODispatcher
import data.api.RecipeApi
import data.repo.RecipeRepo
import kotlinx.coroutines.withContext

class RecipeCase(private val recipeRepo: RecipeRepo) {
    suspend fun getRecipe(): String {
        return withContext(IODispatcher) {
            recipeRepo.getRecipe()
        }
    }
}

object CaseProvider {
    fun getCase() = RecipeCase(RecipeRepo(RecipeApi()))
}