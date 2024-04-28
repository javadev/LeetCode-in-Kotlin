package g2501_2600.s2580_count_ways_to_group_overlapping_ranges

// #Medium #Array #Sorting #2023_07_10_Time_669_ms_(100.00%)_Space_122.8_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countWays(ranges: Array<IntArray>): Int {
        var cnt = 1
        ranges.sortWith { a, b -> if (a[0] != b[0]) a[0] - b[0] else a[1] - b[1] }
        var curr = ranges[0]
        for (i in 1 until ranges.size) {
            if (ranges[i][1] < curr[0] || ranges[i][0] > curr[1]) {
                ++cnt
                curr = ranges[i]
            } else {
                curr[1] = Math.max(curr[1], ranges[i][1])
            }
        }
        return powMod(2, cnt.toLong()).toInt()
    }

    private fun powMod(b: Long, e: Long): Long {
        var b = b
        var e = e
        var ans: Long = 1
        while (e != 0L) {
            if (e and 1L == 1L) {
                ans *= b
                ans %= MOD.toLong()
            }
            b *= b
            b %= MOD.toLong()
            e = e shr 1
        }
        return ans
    }

    companion object {
        var MOD = 1e9.toInt() + 7
    }
}
