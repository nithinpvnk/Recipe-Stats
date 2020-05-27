package com.techdining.www.recipestats.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.techdining.www.recipestats.R
import com.techdining.www.recipestats.viewModel.RecipeSearchViewModel

class RecipeSearchFragment : Fragment() {

    companion object {
        fun newInstance() = RecipeSearchFragment()
    }

    private lateinit var viewModel: RecipeSearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recipe_search_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RecipeSearchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}