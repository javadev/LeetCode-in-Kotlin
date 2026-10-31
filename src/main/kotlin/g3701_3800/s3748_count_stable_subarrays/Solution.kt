package g3701_3800.s3748_count_stable_subarrays

// #Hard #Array #Binary_Search #Prefix_Sum #Senior_Staff #Weekly_Contest_476
// #2026_04_26_Time_9_ms_(100.00%)_Space_183.68_MB_(43.30%)

import kotlin.math.min

class Solution {
    fun countStableSubarrays(nums: IntArray, queries: Array<IntArray>): LongArray {
        val n = nums.size
        val preSum = LongArray(n + 1)
        val idx = IntArray(n)
        val end = IntArray(n)
        var cnt = 0
        var prv = -1
        for (i in 0..<n) {
            if (nums[i] >= prv) {
                cnt++
            } else {
                cnt = 1
            }
            prv = nums[i]
            preSum[i + 1] = preSum[i] + cnt
            idx[i] = cnt - 1
        }
        end[n - 1] = n - 1
        for (i in n - 2 downTo 0) {
            if (idx[i] + 1 == idx[i + 1]) {
                end[i] = end[i + 1]
            } else {
                end[i] = i
            }
        }
        val ans = LongArray(queries.size)
        for (l in queries.indices) {
            val i = queries[l][0]
            val j = queries[l][1]
            var res = preSum[j + 1] - preSum[i]
            val endIdx = min(end[i], j)
            res -= (endIdx - i + 1).toLong() * idx[i]
            ans[l] = res
        }
        return ans
    }
}
