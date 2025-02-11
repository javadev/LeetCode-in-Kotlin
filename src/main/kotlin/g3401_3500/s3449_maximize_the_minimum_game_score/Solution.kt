package g3401_3500.s3449_maximize_the_minimum_game_score

// #Hard #Array #Greedy #Binary_Search #2025_02_11_Time_123_ms_(100.00%)_Space_62.76_MB_(100.00%)

class Solution {
    private fun judge(points: IntArray, m: Long, tgt: Long): Boolean {
        var m = m
        var cur: Long
        var nxt = 0L
        val n = points.size
        for (i in 0..<n) {
            if (i == n - 1 && nxt >= tgt) {
                return true
            }
            m--
            cur = nxt + points[i]
            nxt = 0
            if (cur < tgt) {
                val req = (tgt - cur - 1) / points[i] + 1
                if (i < n - 1) {
                    nxt = points[i + 1] * req
                }
                m -= req * 2
            }
            if (m < 0) {
                return false
            }
        }
        return true
    }

    fun maxScore(points: IntArray, m: Int): Long {
        var x = 0L
        var y = 10000000L * m
        while (x < y - 1) {
            val mid = (x + y) / 2
            if (judge(points, m.toLong(), mid)) {
                x = mid
            } else {
                y = mid - 1
            }
        }
        while (judge(points, m.toLong(), x + 1)) {
            x++
        }
        return x
    }
}
