package com.techdining.www.recipestats.dataModels

data class Hit(
    val bookmarked: Boolean, // false
    val bought: Boolean, // false
    val recipe: Recipe
)