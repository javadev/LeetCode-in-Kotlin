package g3001_3100.s3068_find_the_maximum_sum_of_node_values

// #Hard #Array #Dynamic_Programming #Sorting #Greedy #Tree #Bit_Manipulation
// #2024_03_31_Time_531_ms_(66.67%)_Space_64.9_MB_(66.67%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

@Suppress("UNUSED_PARAMETER")
class Solution {
    fun maximumValueSum(nums: IntArray, k: Int, edges: Array<IntArray>): Long {
        var res: Long = 0
        var d = 1 shl 30
        var c = 0
        for (a in nums) {
            val b = a xor k
            res += max(a, b)
            c = c xor if (a < b) 1 else 0
            d = min(d, abs((a - b)))
        }
        return res - d * c
    }
}
