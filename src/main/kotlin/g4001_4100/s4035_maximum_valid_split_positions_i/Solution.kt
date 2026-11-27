package g4001_4100.s4035_maximum_valid_split_positions_i

// #Medium #Array #Math #Enumeration #Number_Theory #Senior #Biweekly_Contest_190
// #2026_11_25_Time_2_ms_(98.99%)_Space_45.72_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxValidSplits(nums: IntArray): Int {
        val n = nums.size
        val pref = IntArray(n + 1)
        val suf = IntArray(n + 1)
        for (k in 0..<n) {
            pref[k + 1] = gcd(pref[k], nums[k])
        }
        for (k in n - 1 downTo 0) {
            suf[k] = gcd(suf[k + 1], nums[k])
        }
        val total = pref[n]
        var best = 0
        for (k in 0..n) {
            if (pref[k] == suf[k]) {
                best++
            }
        }
        for (i in 0..<n) {
            val g = gcd(pref[i], suf[i + 1])
            if (g == total) {
                continue
            }
            val l = if (pref[i] == g) walk(nums, 0, 0, 1, g) else walk(nums, i + 1, pref[i], 1, g)
            val r =
                if (suf[i + 1] == g) {
                    walk(nums, n - 1, 0, -1, g)
                } else {
                    walk(nums, i - 1, suf[i + 1], -1, g)
                }
            best = max(best, r - l + 2 - (if (l <= i && i <= r) 1 else 0))
        }
        return best
    }

    private fun walk(nums: IntArray, k: Int, cur: Int, step: Int, g: Int): Int {
        var k = k
        var cur = cur
        while (cur != g) {
            cur = gcd(cur, nums[k])
            k += step
        }
        return k
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val t = a % b
            a = b
            b = t
        }
        return a
    }
}
