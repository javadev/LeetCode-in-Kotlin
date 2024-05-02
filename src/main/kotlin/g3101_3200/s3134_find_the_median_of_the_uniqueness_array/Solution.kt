package g3101_3200.s3134_find_the_median_of_the_uniqueness_array

// #Hard #Array #Hash_Table #Binary_Search #Sliding_Window
// #2024_05_02_Time_733_ms_(100.00%)_Space_75.5_MB_(16.67%)

import kotlin.math.max

class Solution {
    fun medianOfUniquenessArray(nums: IntArray): Int {
        var max = 0
        for (x in nums) {
            max = max(max, x)
        }
        val n = nums.size
        val k = (n.toLong() * (n + 1) / 2 + 1) / 2
        var left = 0
        var right = n / 2
        while (left <= right) {
            val mid = left + right shr 1
            if (check(nums, max, mid, k)) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun check(nums: IntArray, max: Int, target: Int, k: Long): Boolean {
        var count: Long = 0
        var distinct = 0
        val n = nums.size
        var left = 0
        var right = 0
        val freq = IntArray(max + 1)
        while (right < n) {
            var x = nums[right++]
            if (++freq[x] == 1) {
                distinct++
            }
            while (distinct > target) {
                x = nums[left++]
                if (--freq[x] == 0) {
                    distinct--
                }
            }
            count += (right - left).toLong()
            if (count >= k) {
                return true
            }
        }
        return false
    }
}
