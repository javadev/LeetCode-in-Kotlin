package g3901_4000.s3984_divisible_game

// #Medium #Array #Dynamic_Programming #Math #Enumeration #Number_Theory #Staff #Weekly_Contest_509
// #2026_11_03_Time_22_ms_(93.00%)_Space_46.30_MB_(94.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun divisibleGame(nums: IntArray): Int {
        val prime = HashSet<Int?>()
        val mod = 1e9.toInt() + 7
        var bestscore = nums[0].toLong()
        for (i in nums) {
            bestscore = min(bestscore, i.toLong())
        }
        bestscore = -bestscore
        var bestprime: Long = 2
        for (i in nums) {
            var i = i
            var j = 2
            while (j * j <= i) {
                if (i % j == 0) {
                    prime.add(j)
                    while (i % j == 0) {
                        i = i / j
                    }
                }
                j++
            }
            if (i > 1) {
                prime.add(i)
            }
        }
        for (p in prime) {
            var curr: Long = 0
            var maxi = Long.MIN_VALUE
            for (i in nums) {
                val `val` = (if (i % p!! == 0) i else -i).toLong()
                curr = max(0, curr + `val`)
                maxi = max(maxi, curr)
            }
            if (maxi > bestscore) {
                bestscore = maxi
                bestprime = p!!.toLong()
            } else if (maxi == bestscore && p!! < bestprime) {
                bestprime = p.toLong()
            }
        }
        bestscore = ((bestscore % mod) + mod) % mod
        return ((bestscore * (bestprime % mod)) % mod).toInt()
    }
}
