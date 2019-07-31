package presentation

import data.api.BackgroundDispatcher
import data.api.IODispatcher
import domain.CaseProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RecipePresenter(private val view: RecipeView) {
    private val case = CaseProvider.getCase()

    fun start() {
        GlobalScope.apply {
            launch(IODispatcher) {
                val s = case.getRecipe()
                println(s)
                withContext(Dispatchers.Main){
                    view.showState(RecipeState(s))
                }
            }
        }
    }
}