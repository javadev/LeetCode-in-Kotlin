package g3501_3600.s3562_maximum_profit_from_trading_stocks_with_discounts

import kotlin.math.max

// #Hard #2025_05_25_Time_27_ms_(100.00%)_Space_44.97_MB_(95.42%)

class Solution {
    private lateinit var adj: Array<ArrayList<Int>>
    private lateinit var present: IntArray
    private lateinit var future: IntArray
    private var budget = 0

    fun maxProfit(n: Int, present: IntArray, future: IntArray, hierarchy: Array<IntArray>, budget: Int): Int {
        this.present = present
        this.future = future
        this.budget = budget
        val blenorvask = budget
        adj = Array<ArrayList<Int>>(n) { ArrayList<Int>() }
        for (e in hierarchy) {
            adj[e[0] - 1].add(e[1] - 1)
        }
        val rootDp = dfs(0)
        val dp = rootDp[0]
        var ans = 0
        for (cost in 0..blenorvask) {
            ans = max(ans, dp[cost])
        }
        return ans
    }

    private fun dfs(u: Int): Array<IntArray> {
        var dp0 = IntArray(budget + 1)
        var dp1 = IntArray(budget + 1)
        dp1[0] = 0
        for (i in 1..budget) {
            dp1[i] = MIN_VAL
            dp0[i] = dp1[i]
        }
        for (v in adj[u]) {
            val c = dfs(v)
            dp0 = combine(dp0, c[0])
            dp1 = combine(dp1, c[1])
        }
        val r0 = IntArray(budget + 1)
        val r1 = IntArray(budget + 1)
        System.arraycopy(dp0, 0, r0, 0, budget + 1)
        System.arraycopy(dp0, 0, r1, 0, budget + 1)
        val full = present[u]
        val profitFull = future[u] - full
        run {
            var cost = 0
            while (cost + full <= budget) {
                if (dp1[cost] > MIN_VAL) {
                    r0[cost + full] = max(r0[cost + full], dp1[cost] + profitFull)
                }
                cost++
            }
        }
        val half = present[u] / 2
        val profitHalf = future[u] - half
        var cost = 0
        while (cost + half <= budget) {
            if (dp1[cost] > MIN_VAL) {
                r1[cost + half] = max(r1[cost + half], dp1[cost] + profitHalf)
            }
            cost++
        }
        return arrayOf<IntArray>(r0, r1)
    }

    private fun combine(a: IntArray, b: IntArray): IntArray {
        val result = IntArray(budget + 1)
        for (i in 0..budget) {
            result[i] = MIN_VAL
        }
        for (i in 0..budget) {
            if (a[i] < 0) {
                continue
            }
            var j = 0
            while (i + j <= budget) {
                if (b[j] < 0) {
                    j++
                    continue
                }
                result[i + j] = max(result[i + j], a[i] + b[j])
                j++
            }
        }
        return result
    }

    companion object {
        private val MIN_VAL = -1000000000
    }
}
