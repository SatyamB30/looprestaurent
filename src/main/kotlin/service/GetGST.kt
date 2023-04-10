package service

import models.Categories
import models.Dish
import models.SubCategories

object GST {
    fun getGst(dish: Dish):Float {
        var gstPercentage = 0
        when(dish.getDishCategory()){
            Categories.Main_Course, Categories.Starters -> {
                gstPercentage = 5
            }
            Categories.Desserts ->{
                gstPercentage = 5
            }
            Categories.Beverages ->{
                if (dish.getDishSubCategory() == SubCategories.Alcoholic){
                    gstPercentage = 18
                }
                else{
                    gstPercentage = 0
                }
            }
        }

        var finalDishPrice = dish.getDishPrice().toFloat()
        finalDishPrice += (finalDishPrice * gstPercentage/100)
        return finalDishPrice
    }
}