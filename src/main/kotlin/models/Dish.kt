package models

class Dish(val name: String, val category: Categories, val subCategories: SubCategories, val price: Int) {
    fun getDishName(): String {
        return name
    }

    fun getDishCategory(): Categories {
        return category
    }

    fun getDishSubCategory(): SubCategories {
        return subCategories
    }

    fun getDishPrice(): Int {
        return price
    }

    fun printDish() {
        println("${name}, ${category}, ${subCategories}, $price")
    }
}