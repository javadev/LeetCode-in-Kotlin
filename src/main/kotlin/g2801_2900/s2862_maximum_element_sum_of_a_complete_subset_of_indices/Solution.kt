package g2801_2900.s2862_maximum_element_sum_of_a_complete_subset_of_indices

// #Hard #Array #Math #Number_Theory #2023_12_21_Time_259_ms_(100.00%)_Space_40.1_MB_(100.00%)

import kotlin.math.floor
import kotlin.math.max
import kotlin.math.sqrt

class Solution {
    fun maximumSum(nums: List<Int>): Long {
        var ans: Long = 0
        val n = nums.size
        val bound = floor(sqrt(n.toDouble())).toInt()
        val squares = IntArray(bound + 1)
        for (i in 1..bound + 1) {
            squares[i - 1] = i * i
        }
        for (i in 1..n) {
            var res: Long = 0
            var idx = 0
            var curr = i * squares[idx]
            while (curr <= n) {
                res += nums[curr - 1].toLong()
                curr = i * squares[++idx]
            }
            ans = max(ans.toDouble(), res.toDouble()).toLong()
        }
        return ans
    }
}
