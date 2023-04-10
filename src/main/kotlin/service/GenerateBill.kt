package service

import repository.DishRepository

class Bill {
    private var noOfItems = 0
    private var dishList: MutableList<String> = mutableListOf()
    var totalcost:Float = 0F

    private fun getOrderList(orderString: String): List<String> {
        var dishes = orderString.split(',').map { it.trimStart() }
        dishes = dishes.map { s:String -> s.trimEnd() }
        return dishes
    }

    fun getBill(orderString: String): Float{
        dishList = getOrderList(orderString).toMutableList()
        var totalWithoutGST = 0
        for (dishName in dishList){
            val dish = DishRepository.getDish(dishName)
            val withgstcost = GST.getGst(dish!!)
            println(withgstcost)
            totalcost += withgstcost
            totalWithoutGST += dish.getDishPrice()
        }
        totalcost += addServiceCharge(totalWithoutGST)
        return totalcost
    }

    private fun addServiceCharge(totalWithoutGST: Int):Float{
        return totalWithoutGST * 0.05F
    }
}