package g1401_1500.s1418_display_table_of_food_orders_in_a_restaurant

// #Medium #Array #String #Hash_Table #Sorting #Ordered_Set
// #2023_06_07_Time_710_ms_(100.00%)_Space_67.4_MB_(100.00%)

import java.util.TreeMap

class Solution {
    fun displayTable(orders: List<List<String>>): List<List<String>> {
        val map = TreeMap<Int, MutableMap<String, Int>>()
        val dishSet: MutableSet<String> = HashSet()
        for (order in orders) {
            val tableNumber = order[1].toInt()
            val dishName = order[2]
            dishSet.add(dishName)
            map.putIfAbsent(tableNumber, HashMap())
            val dishCountMap = map[tableNumber]!!
            if (!dishCountMap.containsKey(dishName)) {
                dishCountMap[dishName] = 1
            } else {
                dishCountMap[dishName] = dishCountMap[dishName]!! + 1
            }
        }
        val dishes: MutableList<String> = ArrayList(dishSet)
        dishes.sort()
        dishes.add(0, "Table")
        val result: MutableList<List<String>> = ArrayList()
        result.add(dishes)
        for ((key) in map) {
            val row: MutableList<String> = ArrayList()
            row.add("" + key)
            for (i in 1 until dishes.size) {
                if (map[key]!!.containsKey(dishes[i])) {
                    row.add(Integer.toString(map[key]!![dishes[i]]!!))
                } else {
                    row.add("0")
                }
            }
            result.add(row)
        }
        return result
    }
}
