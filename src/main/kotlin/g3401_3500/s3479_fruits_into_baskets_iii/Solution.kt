package g3401_3500.s3479_fruits_into_baskets_iii

// #Medium #Array #Binary_Search #Ordered_Set #Segment_Tree
// #2025_03_10_Time_555_ms_(100.00%)_Space_78.68_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        var unp = 0
        var max = 0
        val list: MutableList<Int> = ArrayList<Int>()
        for (basket in baskets) {
            list.add(basket)
            max = max(max, basket)
        }
        for (fruit in fruits) {
            if (fruit > max) {
                unp++
                continue
            }
            var placed = false
            for (j in list.indices) {
                if (list[j] >= fruit) {
                    list.removeAt(j)
                    placed = true
                    break
                }
            }
            if (!placed) {
                unp++
            }
        }
        return unp
    }
}
