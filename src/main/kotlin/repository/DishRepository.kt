package repository

import models.Dish

object DishRepository {
    private var dishes = mutableListOf<Dish>()

    fun addDish(dish: Dish) {
        dishes.add(dish)
    }

    fun getDish(name: String): Dish? {
        for (dish in dishes) {
            if (dish.getDishName() == name) {
                return dish
            }
        }
        return null
    }

    fun printAllDishes(){
        for (dish in dishes) {
            dish.printDish()
        }
    }
}