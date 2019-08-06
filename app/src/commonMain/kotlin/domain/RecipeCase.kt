package domain

import data.api.RecipeApi
import data.repo.RecipeRepo
import domain.model.Recipes
import domain.model.RecipesEntityMapper

class RecipeCase(private val recipeRepo: RecipeRepo) {
    suspend fun getRecipe(): Recipes {
        return recipeRepo.getRecipe().let { RecipesEntityMapper.transform(it) }
    }

    suspend fun getRecipe(search: String): Recipes{
        return recipeRepo.getRecipe(search).let { RecipesEntityMapper.transform(it) }
    }
}

object CaseProvider {
    fun getCase() = RecipeCase(RecipeRepo(RecipeApi()))
}