package sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import presentation.RecipePresenter
import presentation.RecipeState
import presentation.RecipeView
import java.lang.Exception

class MainActivity : AppCompatActivity(), RecipeView {
    override fun showState(state: RecipeState) {
        try {
            findViewById<TextView>(R.id.main_text).text = state.s
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