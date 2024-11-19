package g2601_2700.s2616_minimize_the_maximum_difference_of_pairs

// #Medium #Array #Greedy #Binary_Search #2023_07_14_Time_556_ms_(100.00%)_Space_64_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun ispossible(nums: IntArray, p: Int, diff: Int): Boolean {
        var p = p
        val n = nums.size
        var i = 1
        while (i < n) {
            if (nums[i] - nums[i - 1] <= diff) {
                p--
                i++
            }
            i++
        }
        return p <= 0
    }

    fun minimizeMax(nums: IntArray, p: Int): Int {
        val n = nums.size
        nums.sort()
        var left = 0
        var right = nums[n - 1] - nums[0]
        var ans = right
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (ispossible(nums, p, mid)) {
                ans = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return ans
    }
}
