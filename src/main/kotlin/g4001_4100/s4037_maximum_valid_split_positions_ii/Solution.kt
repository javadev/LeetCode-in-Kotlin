package g4001_4100.s4037_maximum_valid_split_positions_ii

// #Hard #Array #Math #Enumeration #Number_Theory #Principal #Biweekly_Contest_190
// #2026_11_25_Time_12_ms_(95.65%)_Space_120.92_MB_(69.57%)

import kotlin.math.max

class Solution {
    fun maxValidSplits(nums: IntArray): Int {
        val n = nums.size
        val preGcd = IntArray(n)
        var g = 0
        for (i in 0..<n) {
            g = gcd(g, nums[i])
            preGcd[i] = g
        }
        val sufGcd = IntArray(n + 1)
        for (i in n - 1 downTo 0) {
            sufGcd[i] = gcd(sufGcd[i + 1], nums[i])
        }
        val allGcd = sufGcd[0]
        var p = 0
        while (preGcd[p] != allGcd) {
            p++
        }
        var q = n - 1
        while (sufGcd[q] != allGcd) {
            q--
        }
        var ans = max(q - p, 0)
        for (i in 0..<n) {
            if (i > 0 && preGcd[i] == preGcd[i - 1]) {
                continue
            }
            val newG = if (i > 0) gcd(preGcd[i - 1], sufGcd[i + 1]) else sufGcd[i + 1]
            if (newG == allGcd) {
                continue
            }
            g = 0
            for (j in 0..<n) {
                if (j == i) {
                    continue
                }
                g = gcd(g, nums[j])
                if (g == newG) {
                    p = j
                    break
                }
            }
            g = 0
            for (j in n - 1 downTo 0) {
                if (j == i) {
                    continue
                }
                g = gcd(g, nums[j])
                if (g == newG) {
                    q = j
                    break
                }
            }
            var res = q - p
            if (p <= i && i < q) {
                res--
            }
            ans = max(ans, res)
            break
        }
        return ans
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (a != 0) {
            val tmp = a
            a = b % a
            b = tmp
        }
        return b
    }
}
