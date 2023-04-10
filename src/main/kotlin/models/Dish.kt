package models

class Dish(val name: String, val category: Categories, val sub_categorues: SubCategories, val price: Int) {
    fun getDishName(): String {
        return name
    }

    fun printDish() {
        println("${name}, ${category}, ${sub_categorues}, $price")
    }
}