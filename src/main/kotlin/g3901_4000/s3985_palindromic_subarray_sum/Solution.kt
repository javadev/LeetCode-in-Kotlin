package g3901_4000.s3985_palindromic_subarray_sum

// #Hard #Array #Binary_Search #Prefix_Sum #Hash_Function #Senior_Staff #Weekly_Contest_509
// #2026_11_03_Time_13_ms_(100.00%)_Space_141.97_MB_(58.82%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun getSum(nums: IntArray): Long {
        val prefix = buildPrefixSum(nums)
        val oddMax = calculateOdd(nums, prefix)
        val evenMax = calculateEven(nums, prefix)
        return max(oddMax, evenMax)
    }

    private fun buildPrefixSum(nums: IntArray): LongArray {
        val n = nums.size
        val prefix = LongArray(n + 1)
        for (i in 0..<n) {
            prefix[i + 1] = prefix[i] + nums[i]
        }
        return prefix
    }

    private fun calculateOdd(nums: IntArray, prefix: LongArray): Long {
        val n = nums.size
        val d1 = IntArray(n)
        var l = 0
        var r = -1
        var ans: Long = 0
        for (i in 0..<n) {
            var k = if (i > r) 1 else min(d1[l + r - i], r - i + 1)
            k = expandOdd(nums, i, k)
            d1[i] = k
            val left = i - k + 1
            val right = i + k - 1
            ans = max(ans, getRangeSum(prefix, left, right))
            if (right > r) {
                l = left
                r = right
            }
        }
        return ans
    }

    private fun expandOdd(nums: IntArray, i: Int, k: Int): Int {
        var k = k
        val n = nums.size
        while (i - k >= 0 && i + k < n && nums[i - k] == nums[i + k]) {
            k++
        }
        return k
    }

    private fun calculateEven(nums: IntArray, prefix: LongArray): Long {
        val n = nums.size
        val d2 = IntArray(n)
        var l = 0
        var r = -1
        var ans: Long = 0
        for (i in 0..<n) {
            var k = if (i > r) 0 else min(d2[l + r - i + 1], r - i + 1)
            k = expandEven(nums, i, k)
            d2[i] = k
            if (k > 0) {
                val left = i - k
                val right = i + k - 1
                ans = max(ans, getRangeSum(prefix, left, right))
                if (right > r) {
                    l = left
                    r = right
                }
            }
        }
        return ans
    }

    private fun expandEven(nums: IntArray, i: Int, k: Int): Int {
        var k = k
        while (i - k - 1 >= 0 && i + k < nums.size && nums[i - k - 1] == nums[i + k]) {
            k++
        }
        return k
    }

    private fun getRangeSum(prefix: LongArray, left: Int, right: Int): Long = prefix[right + 1] - prefix[left]
}
