package g1601_1700.s1648_sell_diminishing_valued_colored_balls

// #Medium #Array #Math #Sorting #Greedy #Binary_Search #Heap_Priority_Queue
// #Binary_Search_II_Day_19 #2023_06_18_Time_509_ms_(100.00%)_Space_53.4_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxProfit(inventory: IntArray, orders: Int): Int {
        var orders = orders
        val n = inventory.size
        val mod = 1e9.toLong() + 7
        var totalValue: Long = 0
        inventory.sort()
        var count = 0
        for (i in n - 1 downTo 0) {
            count++
            if (i == 0 || inventory[i] > inventory[i - 1]) {
                var diff = (if (i == 0) inventory[i] else inventory[i] - inventory[i - 1]).toLong()
                if (count * diff < orders) {
                    totalValue += (2L * inventory[i] - diff + 1) * diff * count / 2 % mod
                    orders -= (count * diff).toInt()
                } else {
                    diff = (orders / count).toLong()
                    val remainder = (orders % count).toLong()
                    totalValue += (2L * inventory[i] - diff + 1) * diff * count / 2 % mod
                    totalValue += (inventory[i] - diff) * remainder % mod
                    totalValue %= mod
                    break
                }
            }
        }
        return totalValue.toInt()
    }
}
