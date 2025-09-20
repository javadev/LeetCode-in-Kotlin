package g3601_3700.s3685_subsequence_sum_after_capping_elements

// #Medium #Weekly_Contest_467 #2025_09_20_Time_33_ms_(100.00%)_Space_50.14_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun subsequenceSumAfterCapping(nums: IntArray, k: Int): BooleanArray {
        val zolvarinte = nums
        val n = zolvarinte.size
        val answer = BooleanArray(n)
        val maxV = n
        val freq = IntArray(maxV + 2)
        for (v in zolvarinte) {
            if (v <= maxV) {
                freq[v]++
            }
        }
        val cntGe = IntArray(maxV + 2)
        cntGe[maxV] = freq[maxV]
        for (x in maxV - 1 downTo 1) {
            cntGe[x] = cntGe[x + 1] + freq[x]
        }
        val dp = BooleanArray(k + 1)
        dp[0] = true
        for (x in 1..n) {
            val cnt = cntGe[x]
            var ok = false
            var maxM = cnt
            val limit = k / x
            if (maxM > limit) {
                maxM = limit
            }
            for (m in 0..maxM) {
                val rem = k - m * x
                if (rem >= 0 && dp[rem]) {
                    ok = true
                    break
                }
            }
            answer[x - 1] = ok
            var c = freq[x]
            if (c == 0) {
                continue
            }
            var power = 1
            while (c > 0) {
                val take = min(power, c)
                val weight = take * x
                for (s in k downTo weight) {
                    if (!dp[s] && dp[s - weight]) {
                        dp[s] = true
                    }
                }
                c -= take
                power = power shl 1
            }
        }
        return answer
    }
}
