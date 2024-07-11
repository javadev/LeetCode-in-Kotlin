package g3201_3300.s3213_construct_string_with_minimum_cost

// #Hard #Array #String #Dynamic_Programming #Suffix_Array
// #2024_07_09_Time_182_ms_(100.00%)_Space_61.4_MB_(72.97%)

import kotlin.math.min

class Solution {
    private class Node {
        var cost: Int = -1
        var chd: Array<Node?> = arrayOfNulls(26)
    }

    private var rt: Node? = null

    fun minimumCost(target: String, words: Array<String>, costs: IntArray): Int {
        rt = Node()
        val m = words.size
        val n = target.length
        for (i in 0 until m) {
            if (words[i].length <= n) {
                insert(words[i], costs[i])
            }
        }
        val dp = IntArray(n + 1)
        dp.fill(INVALID)
        dp[0] = 0
        for (i in 0 until n) {
            if (dp[i] == INVALID) {
                continue
            }
            val nowC = dp[i]
            var now = rt
            var j = i
            while (now != null && j < n) {
                val ch = target[j].code - 'a'.code
                now = now.chd[ch]
                if (now != null && now.cost != -1) {
                    dp[j + 1] = min(dp[j + 1].toDouble(), (nowC + now.cost).toDouble()).toInt()
                }
                ++j
            }
        }

        return if (dp[n] == INVALID) -1 else dp[n]
    }

    private fun insert(wd: String, cst: Int) {
        val len = wd.length
        var now = rt
        for (i in 0 until len) {
            val ch = wd[i].code - 'a'.code
            if (now!!.chd[ch] == null) {
                now.chd[ch] = Node()
            }
            now = now.chd[ch]
        }
        if (now!!.cost == -1 || now.cost > cst) {
            now.cost = cst
        }
    }

    companion object {
        private const val INVALID = Int.MAX_VALUE
    }
}
