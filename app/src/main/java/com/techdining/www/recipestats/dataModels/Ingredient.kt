package com.techdining.www.recipestats.dataModels

data class Ingredient(
    val food: String?, // chicken - drumsticks
    val foodCategory: String?, // Poultry
    val measure: String?, // gram
    val quantity: Int?, // 640
    val text: String?, // 640 grams chicken - drumsticks and thighs ( 3 whole chicken legs cut apart)
    val weight: Int? // 640
)