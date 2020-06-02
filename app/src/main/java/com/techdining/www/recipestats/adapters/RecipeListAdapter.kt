package com.techdining.www.recipestats.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techdining.www.recipestats.R

class RecipeListAdapter(i: Int) : RecyclerView.Adapter<RecipeListAdapter.PagerVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {

        return PagerVH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.individual_recipe_item, parent, false)
        )
    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
    }

    class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}
