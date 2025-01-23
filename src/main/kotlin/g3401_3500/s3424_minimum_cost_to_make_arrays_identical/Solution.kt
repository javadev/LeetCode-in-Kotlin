package g3401_3500.s3424_minimum_cost_to_make_arrays_identical

// #Medium #Array #Sorting #Greedy #2025_01_23_Time_38_(100.00%)_Space_64.36_(97.14%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minCost(arr: IntArray, brr: IntArray, k: Long): Long {
        val n = arr.size
        var sum1: Long = 0
        var sum2: Long = 0
        for (i in 0..<n) {
            sum1 = sum1 + abs((arr[i] - brr[i]))
        }
        if (k < sum1) {
            arr.sort()
            brr.sort()
            sum2 = k
            for (i in 0..<n) {
                sum2 = sum2 + abs((arr[i] - brr[i]))
            }
        } else {
            return sum1
        }
        return min(sum1, sum2)
    }
}
