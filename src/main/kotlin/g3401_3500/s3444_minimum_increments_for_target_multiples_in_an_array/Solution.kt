package g3401_3500.s3444_minimum_increments_for_target_multiples_in_an_array

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask #Number_Theory
// #2025_02_05_Time_34_ms_(100.00%)_Space_44.36_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minimumIncrements(nums: IntArray, target: IntArray): Int {
        val m = target.size
        val fullMask = (1 shl m) - 1
        val lcmArr = LongArray(1 shl m)
        for (mask in 1..<(1 shl m)) {
            var l: Long = 1
            for (j in 0..<m) {
                if ((mask and (1 shl j)) != 0) {
                    l = lcm(l, target[j].toLong())
                }
            }
            lcmArr[mask] = l
        }
        val inf = Long.Companion.MAX_VALUE / 2
        var dp = LongArray(1 shl m)
        for (i in 0..<(1 shl m)) {
            dp[i] = inf
        }
        dp[0] = 0
        for (x in nums) {
            val newdp = dp.clone()
            for (mask in 1..<(1 shl m)) {
                val l = lcmArr[mask]
                val r = x % l
                val cost = (if (r == 0L) 0 else l - r)
                for (old in 0..<(1 shl m)) {
                    val newMask = old or mask
                    newdp[newMask] = min(newdp[newMask], (dp[old] + cost))
                }
            }
            dp = newdp
        }
        return dp[fullMask].toInt()
    }

    private fun gcd(a: Long, b: Long): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }

    private fun lcm(a: Long, b: Long): Long {
        return a / gcd(a, b) * b
    }
}
