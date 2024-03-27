package com.techdining.www.recipestats.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.techdining.www.recipestats.adapters.RecipeListAdapter
import com.techdining.www.recipestats.databinding.RecipeHomeFragmentBinding
import com.techdining.www.recipestats.utils.ItemTransformer
import com.techdining.www.recipestats.viewModel.RecipeHomeViewModel
import timber.log.Timber

class RecipeHomeFragment : Fragment() {

    companion object {
        fun newInstance() = RecipeHomeFragment()
    }

    private lateinit var viewModel: RecipeHomeViewModel
    private lateinit var transformer: ItemTransformer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = RecipeHomeFragmentBinding.inflate(inflater, container, false)
        binding.recipeList.apply {
            adapter = RecipeListAdapter(10).apply {
                registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                    override fun onPageScrolled(
                        position: Int, positionOffset: Float, positionOffsetPixels: Int
                    ) {
                        super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                        transformer = ItemTransformer(positionOffset, position)
                        setPageTransformer(transformer)
                    }
                })
            }
        }
        //TabLayoutMediator(tab_layout, this) { _, _ -> }.attach()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.i("ViewModelProvider is called")
        viewModel = ViewModelProvider(this).get(RecipeHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }
}