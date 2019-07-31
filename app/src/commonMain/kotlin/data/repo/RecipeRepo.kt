package data.repo

import data.api.RecipeApi

class RecipeRepo(private val api: RecipeApi) {
    suspend fun getRecipe() : String {
        return api.getRecipe()
    }
}