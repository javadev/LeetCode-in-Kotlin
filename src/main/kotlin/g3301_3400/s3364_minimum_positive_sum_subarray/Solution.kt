package g3301_3400.s3364_minimum_positive_sum_subarray

// #Easy #Array #Prefix_Sum #Sliding_Window #2024_12_03_Time_3_ms_(98.15%)_Space_38.1_MB_(33.33%)

import kotlin.math.min

class Solution {
    fun minimumSumSubarray(li: List<Int>, l: Int, r: Int): Int {
        val n = li.size
        var min = Int.Companion.MAX_VALUE
        val a = IntArray(n + 1)
        for (i in 1..n) {
            a[i] = a[i - 1] + li[i - 1]
        }
        for (size in l..r) {
            for (i in size - 1..<n) {
                val sum = a[i + 1] - a[i + 1 - size]
                if (sum > 0) {
                    min = min(min, sum)
                }
            }
        }
        return if (min == Int.Companion.MAX_VALUE) {
            -1
        } else {
            min
        }
    }
}
