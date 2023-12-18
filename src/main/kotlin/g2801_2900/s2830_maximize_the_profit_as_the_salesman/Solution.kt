package g2801_2900.s2830_maximize_the_profit_as_the_salesman

// #Medium #Array #Dynamic_Programming #Sorting #Binary_Search
// #2023_12_18_Time_776_ms_(100.00%)_Space_112.8_MB_(33.33%)

import kotlin.math.max

class Solution {
    fun maximizeTheProfit(n: Int, offers: List<List<Int>>): Int {
        val dp = IntArray(n)
        val range = HashMap<Int, MutableList<List<Int>>>()
        for (l in offers) {
            if (range.containsKey(l[0])) {
                range[l[0]]!!.add(l)
            } else {
                val r: MutableList<List<Int>> = ArrayList()
                r.add(l)
                range[l[0]] = r
            }
        }
        var i = 0
        while (i < n) {
            var temp: List<List<Int>> = ArrayList()
            if (range.containsKey(i)) {
                temp = range[i]!!
            }
            dp[i] = if ((i != 0)) max(dp[i], dp[i - 1]) else dp[i]
            for (l in temp) {
                dp[l[1]] =
                    if ((i != 0)
                    ) max(dp[l[1]], (dp[i - 1] + l[2])) else max(
                        dp[l[1]],
                        l[2]
                    )
            }
            i++
        }
        return dp[n - 1]
    }
}
