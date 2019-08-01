package presentation

import data.api.Background
import data.api.Main
import domain.CaseProvider
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RecipePresenter(private val view: RecipeView) {
    private val case = CaseProvider.getCase()

    fun start() {
        GlobalScope.apply {
            launch(Background) {
                val s = case.getRecipe()
                println(s)
                withContext(Main){
                    view.showState(RecipeState(s))
                }
            }
        }
    }
}