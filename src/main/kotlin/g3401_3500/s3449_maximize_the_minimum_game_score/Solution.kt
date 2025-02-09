package g3401_3500.s3449_maximize_the_minimum_game_score

// #Hard #2025_02_09_Time_214_(100.00%)_Space_61.96_(100.00%)

import kotlin.math.max

class Solution {
    fun maxScore(points: IntArray, m: Int): Long {
        val n = points.size
        if (m < n) {
            return 0
        }
        var lo: Long = 1
        var hi = 1e18.toLong()
        var ans: Long = 0
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            var tot: Long = 0
            var tr: Long = 0
            var skip: Long = 0
            var i = 0
            while (i < n && tot <= m) {
                val p = points[i]
                val need = (mid + p - 1L) / p
                if (tr >= need) {
                    tr = 0
                    skip++
                } else {
                    val cur = tr * p
                    val ops = (mid - cur + p - 1L) / p
                    tot += 2 * ops - 1 + skip
                    tr = max((ops - 1), 0)
                    skip = 0
                }
                i++
            }
            if (tot <= m) {
                ans = mid
                lo = mid + 1
            } else {
                hi = mid - 1
            }
        }
        return ans
    }
}
