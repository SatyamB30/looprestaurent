import repository.DishRepository
import service.AddDish
import service.Bill

fun main(args: Array<String>) {
    println("Hello World!")

    AddDish.saveDishs()
    DishRepository.printAllDishes()

    val bill = Bill()
    println(bill.getBill(("Paneer 65, Watermelon Martini, Cosmopolitan ")))

}