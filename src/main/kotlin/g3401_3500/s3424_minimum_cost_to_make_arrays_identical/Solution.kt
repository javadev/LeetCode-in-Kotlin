package g3401_3500.s3424_minimum_cost_to_make_arrays_identical

// #Medium #2025_01_19_Time_217_(100.00%)_Space_77.83_(100.00%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minCost(arr: IntArray, brr: IntArray, k: Long): Long {
        var res1: Long = 0
        var res2: Long = 0
        for (i in arr.indices) {
            res1 = (res1 + abs((arr[i] - brr[i])))
        }
        arr.sort()
        brr.sort()
        for (i in arr.indices) {
            res2 = (res2 + abs((arr[i] - brr[i])))
        }
        return min(res1, (res2 + k))
    }
}
