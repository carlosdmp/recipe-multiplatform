package sample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import domain.model.RecipesDisplay

class RecipeAdapter(private val display: RecipesDisplay) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    override fun onCreateViewHolder(root: ViewGroup, p1: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(root.context).inflate(R.layout.card_view, root, false))
    }

    override fun getItemCount(): Int {
        return display.results.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, pos: Int) {
        //holder.img.setImageResource(display.results.get(pos).thumbnail)
        holder.title.text = display.results[pos].title
        holder.ingredients.text = display.results[pos].ingredients
    }

    class RecipeViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var img: ImageView = v.findViewById(R.id.iv_img)
        var title: TextView = v.findViewById(R.id.tv_title)
        var ingredients: TextView = v.findViewById(R.id.tv_ingredients)
    }

}