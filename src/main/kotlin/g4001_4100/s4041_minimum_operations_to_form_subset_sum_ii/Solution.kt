package g4001_4100.s4041_minimum_operations_to_form_subset_sum_ii

// #Hard #Array #Dynamic_Programming #Senior_Staff #Weekly_Contest_517
// #2026_11_25_Time_89_ms_(98.57%)_Space_46.04_MB_(85.71%)

class Solution {
    fun minOperations(nums: IntArray, sum: Int): Int {
        var dp = IntArray(sum + 1)
        dp.fill(INF)
        dp[0] = 0
        for (num in nums) {
            val cost = IntArray(sum + 1)
            cost.fill(INF)
            var v = num
            var k = 0
            while (v > 0) {
                var t = v
                var m = 0
                while (t <= sum) {
                    if (k + m < cost[t]) {
                        cost[t] = k + m
                    }
                    t *= 2
                    m++
                }
                v /= 2
                k++
            }
            val ndp = dp.clone()
            for (t in 1..sum) {
                val c = cost[t]
                if (c >= INF) {
                    continue
                }
                for (j in sum downTo t) {
                    val cur = dp[j - t] + c
                    if (cur < ndp[j]) {
                        ndp[j] = cur
                    }
                }
            }
            dp = ndp
            if (dp[sum] == 0) {
                return 0
            }
        }
        return if (dp[sum] >= INF) -1 else dp[sum]
    }

    companion object {
        private const val INF = 1e9.toInt()
    }
}
