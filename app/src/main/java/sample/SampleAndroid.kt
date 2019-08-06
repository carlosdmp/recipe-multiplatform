package sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import presentation.RecipePresenter
import presentation.RecipeState
import presentation.RecipeView

class MainActivity : AppCompatActivity(), RecipeView {

    private val recipeList: RecyclerView by lazy { findViewById<RecyclerView>(R.id.rv_cardList) }

    override fun showState(state: RecipeState) {
        try {
            recipeList.adapter = RecipeAdapter(state.recipes)
        } catch (e: Exception) {
            print(e.message)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_view)

        recipeList.layoutManager = LinearLayoutManager(this)

        val p = RecipePresenter(this)
        try {
            val searchQuery = intent.getStringExtra("SEARCH")
            if(!searchQuery.isNullOrEmpty()){
                p.start(searchQuery)
            }else {
                p.start()
            }
        } catch (e: Exception) {
            print(e.message)
        }
    }
}