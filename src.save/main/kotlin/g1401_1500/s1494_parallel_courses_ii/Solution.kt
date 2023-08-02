package g1401_1500.s1494_parallel_courses_ii

// #Hard #Dynamic_Programming #Bit_Manipulation #Graph #Bitmask
// #2023_06_13_Time_381_ms_(100.00%)_Space_37_MB_(100.00%)

class Solution {
    fun minNumberOfSemesters(n: Int, relations: Array<IntArray>, k: Int): Int {
        val pres = IntArray(n)
        for (r in relations) {
            val prev = r[0] - 1
            val next = r[1] - 1
            pres[next] = pres[next] or (1 shl prev)
        }
        val dp = IntArray(1 shl n)
        dp.fill(n)
        dp[0] = 0
        for (mask in dp.indices) {
            var canTake = 0
            for (i in 0 until n) {
                // already taken
                if (mask and (1 shl i) != 0) {
                    continue
                }
                // satisfy all pres
                if (mask and pres[i] == pres[i]) {
                    canTake = canTake or (1 shl i)
                }
            }
            // loop each sub-masks
            var take = canTake
            while (take > 0) {
                if (Integer.bitCount(take) > k) {
                    take = take - 1 and canTake
                    continue
                }
                dp[take or mask] = Math.min(dp[take or mask], dp[mask] + 1)
                take = take - 1 and canTake
            }
        }
        return dp[(1 shl n) - 1]
    }
}
