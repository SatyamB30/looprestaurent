import repository.DishRepository
import service.AddDish

fun main(args: Array<String>) {
    println("Hello World!")

    AddDish.saveDishs()
    DishRepository.printAllDishes()
}