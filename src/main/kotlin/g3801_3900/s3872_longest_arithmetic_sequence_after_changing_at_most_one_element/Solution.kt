package g3801_3900.s3872_longest_arithmetic_sequence_after_changing_at_most_one_element

// #Medium #Array #Enumeration #Staff #Weekly_Contest_493
// #2026_07_28_Time_11_ms_(100.00%)_Space_145.68_MB_(86.52%)

import kotlin.math.max

class Solution {
    fun longestArithmetic(nums: IntArray): Int {
        val ans: Int = solve(nums)
        reverse(nums)
        return max(ans, solve(nums))
    }

    companion object {
        private fun solve(nums: IntArray): Int {
            val n = nums.size
            var max = 2
            var diff = nums[1] - nums[0]
            var left = 0
            for (right in 2..<n) {
                if (nums[right] - nums[right - 1] == diff) {
                    max = max(max, right - left + 1)
                    continue
                }
                var temp = right
                var `val` = nums[right - 1] + diff
                while (temp + 1 < n && nums[temp + 1] - `val` == diff) {
                    `val` = nums[++temp]
                }
                max = max(max, temp - left + 1)
                left = right - 1
                diff = nums[right] - nums[right - 1]
            }
            return max
        }

        private fun reverse(nums: IntArray) {
            var i = 0
            var j = nums.size - 1
            while (i < j) {
                val temp = nums[i]
                nums[i++] = nums[j]
                nums[j--] = temp
            }
        }
    }
}
