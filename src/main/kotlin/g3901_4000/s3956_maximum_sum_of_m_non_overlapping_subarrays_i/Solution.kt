package g3901_4000.s3956_maximum_sum_of_m_non_overlapping_subarrays_i

// #Hard #Array #Dynamic_Programming #Binary_Search #Prefix_Sum #Sliding_Window #Queue
// #Monotonic_Queue #Senior_Staff #Weekly_Contest_505
// #2026_10_20_Time_61_ms_(91.07%)_Space_46.56_MB_(83.93%)

import kotlin.math.max

class Solution {
    fun maximumSum(nums: IntArray, m: Int, l: Int, r: Int): Long {
        val n = nums.size
        val pre = LongArray(n + 1)
        for (i in 0..<n) {
            pre[i + 1] = pre[i] + nums[i]
        }
        val neg = (-4e18).toLong()
        var prev = LongArray(n + 1)
        for (i in 0..n) {
            prev[i] = 0
        }
        var res = neg
        for (t in 1..m) {
            val curr = LongArray(n + 1)
            for (i in 0..n) {
                curr[i] = neg
            }
            val dq = IntArray(n + 1)
            var head = 0
            var tail = 0
            for (i in 1..n) {
                curr[i] = curr[i - 1]
                val add = i - l
                if (add >= 0 && prev[add] != neg) {
                    val `val` = prev[add] - pre[add]
                    while (head < tail) {
                        val idx = dq[tail - 1]
                        val last = prev[idx] - pre[idx]
                        if (last <= `val`) {
                            tail--
                        } else {
                            break
                        }
                    }
                    dq[tail++] = add
                }
                val left = i - r
                while (head < tail && dq[head] < left) {
                    head++
                }
                if (head < tail) {
                    val s = dq[head]
                    curr[i] = max(curr[i], pre[i] + prev[s] - pre[s])
                }
            }
            res = max(res, curr[n])
            prev = curr
        }
        return res
    }
}
