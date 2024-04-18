package g3001_3100.s3086_minimum_moves_to_pick_k_ones

// #Hard #Array #Greedy #Prefix_Sum #Sliding_Window
// #2024_04_18_Time_368_ms_(100.00%)_Space_56.8_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minimumMoves(nums: IntArray, k: Int, maxChanges: Int): Long {
        var maxAdjLen = 0
        val n = nums.size
        var numOne = 0
        var l = 0
        var r = 0
        while (r < n) {
            if (nums[r] != 1) {
                maxAdjLen = max(maxAdjLen, (r - l))
                l = r + 1
            } else {
                numOne++
            }
            r++
        }
        maxAdjLen = min(3, max(maxAdjLen, (r - l)))
        if (maxAdjLen + maxChanges >= k) {
            return if (maxAdjLen >= k) {
                k - 1L
            } else {
                max(0, (maxAdjLen - 1)) + (k - maxAdjLen) * 2L
            }
        }
        val ones = IntArray(numOne)
        var ind = 0
        for (i in 0 until n) {
            if (nums[i] == 1) {
                ones[ind++] = i
            }
        }
        val preSum = LongArray(ones.size + 1)
        for (i in 1 until preSum.size) {
            preSum[i] = preSum[i - 1] + ones[i - 1]
        }
        val target = k - maxChanges
        l = 0
        var res = Long.MAX_VALUE
        while (l <= ones.size - target) {
            r = l + target - 1
            val mid = (l + r) / 2
            val median = ones[mid]
            val sum1 = preSum[mid + 1] - preSum[l]
            val sum2 = preSum[r + 1] - preSum[mid + 1]
            val area1 = (mid - l + 1).toLong() * median
            val area2 = (r - mid).toLong() * median
            val curRes = area1 - sum1 + sum2 - area2
            res = min(res.toDouble(), curRes.toDouble()).toLong()
            l++
        }
        res += 2L * maxChanges
        return res
    }
}
