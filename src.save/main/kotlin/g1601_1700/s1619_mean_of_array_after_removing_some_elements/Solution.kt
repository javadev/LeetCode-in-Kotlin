package g1601_1700.s1619_mean_of_array_after_removing_some_elements

// #Easy #Array #Sorting #2023_06_16_Time_178_ms_(100.00%)_Space_37.9_MB_(100.00%)

import kotlin.math.roundToInt

class Solution {
    fun trimMean(arr: IntArray): Double {
        arr.sort()
        val n = arr.size
        var sum: Long = 0
        var i = (n * 0.05).roundToInt()
        while (i < n - n * 0.05) {
            sum += arr[i].toLong()
            i++
        }
        return sum / (n - n * 0.1)
    }
}
