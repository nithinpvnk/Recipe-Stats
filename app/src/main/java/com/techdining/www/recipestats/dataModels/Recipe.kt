package com.techdining.www.recipestats.dataModels

data class Recipe(
    val calories: Double?, // 3033.2012500008163
    val cautions: List<String>?,
    val cuisineType: List<String>?,
    val dietLabels: List<String>?,
    val digest: List<Digest>?,
    val dishType: List<String>?,
    val healthLabels: List<String>?,
    val image: String?, // https://www.edamam.com/web-img/e12/e12b8c5581226d7639168f41d126f2ff.jpg
    val ingredientLines: List<String>?,
    val ingredients: List<Ingredient>?,
    val label: String?, // Chicken Paprikash
    val mealType: List<String>?,
    val shareAs: String?, // http://www.edamam.com/recipe/chicken-paprikash-8275bb28647abcedef0baaf2dcf34f8b/chicken/alcohol-free
    val source: String?, // No Recipes
    val totalDaily: TotalDaily?,
    val totalNutrients: TotalNutrients?,
    val totalTime: Int?, // 0
    val totalWeight: Double?, // 1824.6125000003276
    val uri: String?, // http://www.edamam.com/ontologies/edamam.owl#recipe_8275bb28647abcedef0baaf2dcf34f8b
    val url: String?, // http://norecipes.com/recipe/chicken-paprikash/
    val yield: Int? // 4
)