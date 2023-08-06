package g2701_2800.s2790_maximum_number_of_groups_with_increasing_length

// #Hard #Array #Math #Sorting #Greedy #Binary_Search
// #2023_08_06_Time_545_ms_(100.00%)_Space_62.7_MB_(92.86%)

import kotlin.math.min

class Solution {
    fun maxIncreasingGroups(usageLimits: List<Int>): Int {
        val n: Int = usageLimits.size
        var total: Long = 0
        var k: Long = 0
        val count = IntArray(n + 1)
        count.fill(0)
        for (a in usageLimits) {
            val localA = min(a.toDouble(), n.toDouble()).toInt()
            count[localA]++
        }
        for (i in 0..n) {
            for (j in 0 until count[i]) {
                total += i.toLong()
                if (total >= (k + 1) * (k + 2) / 2) {
                    k++
                }
            }
        }
        return k.toInt()
    }
}
