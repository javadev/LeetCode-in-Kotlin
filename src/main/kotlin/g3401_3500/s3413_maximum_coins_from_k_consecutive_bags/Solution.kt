package g3401_3500.s3413_maximum_coins_from_k_consecutive_bags

// #Medium #Array #Sorting #Greedy #Binary_Search #Prefix_Sum #Sliding_Window
// #2025_01_08_Time_275_(86.67%)_Space_125.92_(80.00%)

import kotlin.math.max

class Solution {
    fun maximumCoins(coins: Array<IntArray>, k: Int): Long {
        coins.sortWith { a: IntArray?, b: IntArray? -> a!![0] - b!![0] }
        val n = coins.size
        var res: Long = 0
        var cur: Long = 0
        var j = 0
        for (ints in coins) {
            while (j < n && coins[j][1] <= ints[0] + k - 1) {
                cur += (coins[j][1] - coins[j][0] + 1).toLong() * coins[j][2]
                j++
            }
            if (j < n) {
                val part = max(0.0, (ints[0] + k - 1 - coins[j][0] + 1).toDouble()).toLong() * coins[j][2]
                res = max(res.toDouble(), (cur + part).toDouble()).toLong()
            }
            cur -= (ints[1] - ints[0] + 1).toLong() * ints[2]
        }
        cur = 0
        j = 0
        for (coin in coins) {
            cur += (coin[1] - coin[0] + 1).toLong() * coin[2]
            while (coins[j][1] < coin[1] - k + 1) {
                cur -= (coins[j][1] - coins[j][0] + 1).toLong() * coins[j][2]
                j++
            }
            val part = max(0.0, (coin[1] - k - coins[j][0] + 1).toDouble()).toLong() * coins[j][2]
            res = max(res, (cur - part))
        }
        return res
    }
}
