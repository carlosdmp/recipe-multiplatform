package sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import presentation.RecipePresenter
import presentation.RecipeState
import presentation.RecipeView

class MainActivity : AppCompatActivity(), RecipeView {
    override fun showState(state: RecipeState) {
        try {
            findViewById<TextView>(R.id.main_text).text = state.recipes.title
        } catch (e: Exception) {
            print(e.message)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val p = RecipePresenter(this)
        try {
            p.start()
        } catch (e: Exception) {
            print(e.message)
        }
    }
}