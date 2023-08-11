package g2501_2600.s2561_rearranging_fruits

// #Hard #Array #Hash_Table #Greedy #2023_07_07_Time_746_ms_(100.00%)_Space_60.5_MB_(100.00%)

class Solution {
    fun minCost(basket1: IntArray, basket2: IntArray): Long {
        val n = basket1.size
        val map1: MutableMap<Int, Int> = HashMap()
        val map2: MutableMap<Int, Int> = HashMap()
        var minVal = Int.MAX_VALUE // Use on indirect swap

        // Counting the basket's number to each HashMap
        for (i in 0 until n) {
            map1[basket1[i]] = map1.getOrDefault(basket1[i], 0) + 1
            map2[basket2[i]] = map2.getOrDefault(basket2[i], 0) + 1
            minVal = minVal.coerceAtMost(basket1[i])
            minVal = minVal.coerceAtMost(basket2[i])
        }

        // build swap list, if any number is too more, add numbers to prepare swap list
        val swapList1: MutableList<Int> = ArrayList()
        for (key in map1.keys) {
            val c1 = map1[key]!!
            val c2 = map2.getOrDefault(key, 0)
            if ((c1 + c2) % 2 == 1) return -1
            if (c1 > c2) {
                var addCnt = (c1 - c2) / 2
                while (addCnt-- > 0) {
                    swapList1.add(key)
                }
            }
        }
        val swapList2: MutableList<Int> = ArrayList()
        for (key in map2.keys) {
            val c1 = map1.getOrDefault(key, 0)
            val c2 = map2[key]!!
            if ((c1 + c2) % 2 == 1) return -1
            if (c2 > c1) {
                var addCnt = (c2 - c1) / 2
                while (addCnt-- > 0) {
                    swapList2.add(key)
                }
            }
        }

        // Sorting
        swapList1.sort()
        swapList2.sortWith { a: Int, b: Int -> b - a }

        // visite swap list
        var res: Long = 0
        for (i in swapList1.indices) {
            // Two choices to swap, direct swap or indirect swap
            res += (2 * minVal).coerceAtMost(swapList1[i].coerceAtMost(swapList2[i])).toLong()
        }
        return res
    }
}
