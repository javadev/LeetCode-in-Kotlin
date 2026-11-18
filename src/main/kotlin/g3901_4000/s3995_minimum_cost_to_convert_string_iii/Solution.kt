package g3901_4000.s3995_minimum_cost_to_convert_string_iii

// #Hard #Array #String #Dynamic_Programming #Senior_Staff #Biweekly_Contest_187
// #2026_11_17_Time_10_ms_(100.00%)_Space_47.23_MB_(68.97%)

class Solution {
    fun minCost(source: String, target: String, rules: MutableList<MutableList<String>>, costs: IntArray): Int {
        val n = source.length
        if (n != target.length) {
            return -1
        }
        if (source == target) {
            return 0
        }
        val m = rules.size
        val len = IntArray(m)
        val pat = arrayOfNulls<String>(m)
        val rep = arrayOfNulls<String>(m)
        val rulesCost = IntArray(m)
        for (i in 0..<m) {
            val p = rules[i][0]
            val r: String = rules[i][1]
            pat[i] = p
            rep[i] = r
            len[i] = p.length
            var wild = 0
            for (c in p.toCharArray()) {
                if (c == '*') {
                    wild++
                }
            }
            rulesCost[i] = costs[i] + wild
        }
        val `in` = Int.MAX_VALUE / 2
        val dp = IntArray(n + 1)
        dp.fill(`in`)
        dp[0] = 0
        for (i in 0..<n) {
            if (dp[i] == `in`) {
                continue
            }
            if (source[i] == target[i] && dp[i] < dp[i + 1]) {
                dp[i + 1] = dp[i]
            }
            for (k in 0..<m) {
                val l = len[k]
                if (i + l > n) {
                    continue
                }
                var match = true
                for (j in 0..<l) {
                    val pc = pat[k]!![j]
                    val sc = source[i + j]
                    if (pc != '*' && pc != sc) {
                        match = false
                        break
                    }
                }
                if (!match) {
                    continue
                }
                if (target.substring(i, i + l) != rep[k]) {
                    continue
                }
                val nd = dp[i] + rulesCost[k]
                if (nd < dp[i + l]) {
                    dp[i + l] = nd
                }
            }
        }
        return if (dp[n] >= `in`) -1 else dp[n]
    }
}
