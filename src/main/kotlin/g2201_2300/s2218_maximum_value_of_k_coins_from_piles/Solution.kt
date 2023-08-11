package g2201_2300.s2218_maximum_value_of_k_coins_from_piles

// #Hard #Array #Dynamic_Programming #Prefix_Sum
// #2023_06_27_Time_313_ms_(100.00%)_Space_42.3_MB_(100.00%)

class Solution {
    fun maxValueOfCoins(piles: List<List<Int>>, k: Int): Int {
        var dp = IntArray(k + 1)
        for (pile in piles) {
            val m = pile.size
            val cum = IntArray(m + 1)
            for (i in 0 until m) {
                cum[i + 1] = cum[i] + pile[i]
            }
            val curdp = IntArray(k + 1)
            for (i in 0..k) {
                var j = 0
                while (j <= m && i + j <= k) {
                    curdp[i + j] = Math.max(curdp[i + j], dp[i] + cum[j])
                    j++
                }
            }
            dp = curdp
        }
        return dp[k]
    }
}
