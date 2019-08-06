package presentation

import data.api.Background
import data.api.Main
import domain.CaseProvider
import domain.model.RecipesDisplay
import domain.model.RecipesDisplayMapper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RecipePresenter(private val view: RecipeView) {
    private val case = CaseProvider.getCase()

    fun start() {
        GlobalScope.apply {
            launch(Background) {
                val recipes = case.getRecipe()
                withContext(Main) {
                    view.showState(RecipeState(RecipesDisplayMapper.transform(recipes)))
                }
            }
        }
    }

    fun start(search: String) {
        GlobalScope.apply {
            launch(Background) {
                val recipes = case.getRecipe(search)
                withContext(Main) {
                    view.showState(RecipeState(RecipesDisplayMapper.transform(recipes)))
                }
            }
        }
    }
}