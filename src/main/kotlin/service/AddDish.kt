package service

import models.Dish
import repository.DishRepository

object AddDish {
    private var dishes = mutableListOf<Dish>()
    fun saveDishs() {
        val no_inputs = readln().toInt()
        var i = 0
        while (i < no_inputs) {
            println(i)
            val (dishName, categoryName, subCatagoryName, price) = readln()!!.split(',')
            val newDish = Dish(
                dishName,
                CategoryType.getCategory(categoryName)!!,
                CategoryType.getSubCategory(subCatagoryName)!!,
                price.trim().toInt()
            )
            DishRepository.addDish(newDish)
            i++
        }
    }
}