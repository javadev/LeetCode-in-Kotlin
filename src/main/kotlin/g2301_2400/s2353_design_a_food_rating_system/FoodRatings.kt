package g2301_2400.s2353_design_a_food_rating_system

import java.util.TreeSet

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {
    private val cus = HashMap<String, TreeSet<Food?>>()
    private val foodHashMap = HashMap<String, Food>()

    init {
        for (i in foods.indices) {
            val food = Food(foods[i], ratings[i], cuisines[i])
            foodHashMap[foods[i]] = food
            if (cus.containsKey(cuisines[i])) {
                cus[cuisines[i]]!!.add(food)
            } else {
                val pq = TreeSet(Comp())
                pq.add(food)
                cus[cuisines[i]] = pq
            }
        }
    }

    fun changeRating(food: String, newRating: Int) {
        val dish = foodHashMap[food]
        val pq = cus[dish!!.cus]!!
        pq.remove(dish)
        dish.rating = newRating
        pq.add(dish)
    }

    fun highestRated(cuisine: String): String {
        return cus[cuisine]!!.first()!!.foodItem
    }

    private class Comp : Comparator<Food> {
        override fun compare(f1: Food, f2: Food): Int {
            return if (f1.rating == f2.rating) {
                f1.foodItem.compareTo(f2.foodItem)
            } else Integer.compare(f2.rating, f1.rating)
        }
    }

    private class Food internal constructor(val foodItem: String, var rating: Int, val cus: String)
}
