package data.repo

import data.api.RecipeApi
import domain.model.RecipesEntity

class RecipeRepo(private val api: RecipeApi) {
    suspend fun getRecipe() : RecipesEntity {
        return api.getRecipe()
    }
}