package data.api

import data.repo.RecipeRepo
import domain.CaseProvider
import domain.RecipeCase
import kotlin.coroutines.*
import kotlinx.coroutines.*
import platform.darwin.*
import presentation.RecipeState
import presentation.RecipeView

internal actual val Main: CoroutineDispatcher = object : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        val queue = dispatch_get_main_queue()
        dispatch_async(queue) {
            block.run()
        }
    }
}

class NativeRecipePresenter(private val view: RecipeView) {
    private val case = CaseProvider.getCase()

    @Throws
    fun start() {
        GlobalScope.apply {
            launch(Background) {
                val s = case.getRecipe()
                println(s)
                withContext(Main) {
                    view.showState(RecipeState(s))
                }
            }
        }
    }
}

internal actual val Background: CoroutineDispatcher = Main

