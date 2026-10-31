package g3801_3900.s3869_count_fancy_numbers_in_a_range

import java.util.*

// #Hard #Dynamic_Programming #Math #Senior_Staff #Biweekly_Contest_178
// #2026_07_28_Time_86_ms_(96.00%)_Space_47.18_MB_(90.00%)

class Solution {
    private lateinit var low: CharArray
    private lateinit var high: CharArray
    private lateinit var dp: Array<Array<Array<LongArray>>>
    private lateinit var good: BooleanArray

    fun countFancy(l: Long, r: Long): Long {
        initBounds(l, r)
        initGood()
        initDp()
        val ans = dfs(0, 0, 1, 1)
        val seen: MutableSet<Long> = HashSet<Long>()
        addIncreasingNumbers(seen, l, r)
        addDecreasingNumbers(seen, l, r)
        return ans + seen.size
    }

    private fun initBounds(l: Long, r: Long) {
        var left = l.toString()
        val right = r.toString()
        val n = right.length
        left = "0".repeat(n - left.length) + left
        low = left.toCharArray()
        high = right.toCharArray()
    }

    private fun initGood() {
        good = BooleanArray(136)
        for (i in 1..135) {
            good[i] = isGood(i)
        }
    }

    private fun initDp() {
        dp = Array<Array<Array<LongArray>>>(high.size + 1) {
            Array<Array<LongArray>>(136) {
                Array<LongArray>(2) {
                    LongArray(2)
                }
            }
        }
        for (a in dp) {
            for (b in a) {
                for (c in b!!) {
                    Arrays.fill(c, -1)
                }
            }
        }
    }

    private fun addIncreasingNumbers(seen: MutableSet<Long>, l: Long, r: Long) {
        for (mask in 1..<(1 shl 9)) {
            var x: Long = 0
            var sum = 0
            for (i in 0..8) {
                if ((mask and (1 shl i)) != 0) {
                    x = x * 10 + i + 1
                    sum += i + 1
                }
            }
            if (x >= l && x <= r && !good[sum]) {
                seen.add(x)
            }
        }
    }

    private fun addDecreasingNumbers(seen: MutableSet<Long>, l: Long, r: Long) {
        for (mask in 1..<(1 shl 10)) {
            var x: Long = 0
            var sum = 0
            var started = false
            for (i in 0..9) {
                if ((mask and (1 shl i)) != 0) {
                    val d = 9 - i
                    if (started || d != 0) {
                        started = true
                        x = x * 10 + d
                        sum += d
                    }
                }
            }
            if (started && x >= l && x <= r && !good[sum]) {
                seen.add(x)
            }
        }
    }

    private fun dfs(pos: Int, sum: Int, tl: Int, tr: Int): Long {
        if (pos == high.size) {
            return (if (good[sum]) 1 else 0).toLong()
        }
        if (dp[pos][sum]!![tl]!![tr] != -1L) {
            return dp[pos][sum]!![tl]!![tr]
        }
        val lo = if (tl == 1) low[pos].code - '0'.code else 0
        val hi = if (tr == 1) high[pos].code - '0'.code else 9
        var res: Long = 0
        for (d in lo..hi) {
            res += dfs(pos + 1, sum + d, nextTight(tl, d, lo), nextTight(tr, d, hi))
        }
        dp[pos][sum]!![tl]!![tr] = res
        return res
    }

    private fun nextTight(tight: Int, digit: Int, limit: Int): Int = if (tight == 1 && digit == limit) 1 else 0

    private fun isGood(x: Int): Boolean {
        if (x < 10) {
            return true
        }
        val s = x.toString().toCharArray()
        var inc = true
        var dec = true
        for (i in 1..<s.size) {
            if (s[i] <= s[i - 1]) {
                inc = false
            }
            if (s[i] >= s[i - 1]) {
                dec = false
            }
        }
        return inc || dec
    }
}
