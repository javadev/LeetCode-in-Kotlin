package g3401_3500.s3430_maximum_and_minimum_sums_of_at_most_size_k_subarrays

// #Hard #Array #Math #Stack #Monotonic_Stack #2025_01_22_Time_31_(100.00%)_Space_74.84_(24.24%)

import kotlin.math.min

class Solution {
    fun minMaxSubarraySum(nums: IntArray, k: Int): Long {
        val sum = solve(nums, k)
        for (i in nums.indices) {
            nums[i] = -nums[i]
        }
        return sum - solve(nums, k)
    }

    private fun solve(nums: IntArray, k: Int): Long {
        val n = nums.size
        val left = IntArray(n)
        val right = IntArray(n)
        val st = IntArray(n)
        var top = -1
        for (i in 0..<n) {
            val num = nums[i]
            while (top != -1 && num < nums[st[top]]) {
                right[st[top--]] = i
            }
            left[i] = if (top == -1) -1 else st[top]
            st[++top] = i
        }
        while (0 <= top) {
            right[st[top--]] = n
        }
        var ans: Long = 0
        for (i in 0..<n) {
            val num = nums[i]
            val l = min((i - left[i]), k)
            val r = min((right[i] - i), k)
            if (l + r - 1 <= k) {
                ans += num.toLong() * l * r
            } else {
                val cnt = (k - r + 1).toLong() * r + (l + r - k - 1).toLong() * (r + k - l) / 2
                ans += num * cnt
            }
        }
        return ans
    }
}
