package g2001_2100.s2006_count_number_of_pairs_with_absolute_difference_k

// #Easy #Array #Hash_Table #Counting #2023_06_23_Time_186_ms_(100.00%)_Space_37.5_MB_(66.67%)

import kotlin.math.abs

class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var pairs = 0
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (abs(nums[i] - nums[j]) == k) {
                    pairs++
                }
            }
        }
        return pairs
    }
}
