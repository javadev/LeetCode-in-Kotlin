package g3701_3800.s3743_maximize_cyclic_partition_score

// #Hard #Array #Dynamic_Programming #Principal #Weekly_Contest_475
// #2026_04_26_Time_40_ms_(96.15%)_Space_120.45_MB_(7.69%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maximumScore(nums: IntArray, k: Int): Long {
        // Find index of minimum element
        var j = 0
        for (i in nums.indices) {
            if (nums[i] < nums[j]) {
                j = i
            }
        }
        // Build array 'a'
        val n = nums.size
        val a = IntArray(n)
        for (i in 0..<n) {
            a[i] = nums[(j + i) % n]
        }
        // Build array 'b' (rotated and reversed)
        val b = IntArray(n)
        for (i in 0..<n) {
            b[i] = nums[(j + 1 + i) % n]
        }
        reverse(b)
        // Compute and return max of f(a, k) and f(b, k)
        return max(f(a, k), f(b, k))
    }

    private fun f(a: IntArray, k: Int): Long {
        val n = a.size
        val dp = Array<LongArray?>(k + 1) { LongArray(n + 1) }
        var mn = Long.MAX_VALUE
        var mx = Long.MIN_VALUE
        // Initialize dp[1][j+1]
        for (j in 0..<n) {
            mn = min(mn, a[j].toLong())
            mx = max(mx, a[j].toLong())
            dp[1]!![j + 1] = mx - mn
        }
        var res = dp[1]!![n]
        for (i in 2..k) {
            var x = Long.MIN_VALUE
            var y = Long.MIN_VALUE
            for (j in i - 1..<n) {
                x = max(x, dp[i - 1]!![j] - a[j])
                y = max(y, dp[i - 1]!![j] + a[j])
                dp[i]!![j + 1] = max(dp[i]!![j], max(x + a[j], y - a[j]))
            }
            res = max(res, dp[i]!![n])
        }
        return res
    }

    private fun reverse(arr: IntArray) {
        var left = 0
        var right = arr.size - 1
        while (left < right) {
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left++
            right--
        }
    }
}
