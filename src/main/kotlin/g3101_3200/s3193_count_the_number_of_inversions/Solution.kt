package g3101_3200.s3193_count_the_number_of_inversions

// #Hard #Array #Dynamic_Programming #2024_06_29_Time_243_ms_(94.74%)_Space_45.5_MB_(100.00%)

class Solution {
    fun numberOfPermutations(n: Int, r: Array<IntArray>): Int {
        r.sortWith { o1: IntArray, o2: IntArray -> o1[0] - o2[0] }
        if (r[0][0] == 0 && r[0][1] > 0) {
            return 0
        }
        var ri = if (r[0][0] == 0) 1 else 0
        var a: Long = 1
        var t: Long
        val m = Array(n) { IntArray(401) }
        m[0][0] = 1
        for (i in 1 until m.size) {
            m[i][0] = m[i - 1][0]
            for (j in 1..i) {
                m[i][j] = (m[i][j] + m[i][j - 1]) % MOD
                m[i][j] = (m[i][j] + m[i - 1][j]) % MOD
            }
            for (j in i + 1..r[ri][1]) {
                m[i][j] = (m[i][j] + m[i][j - 1]) % MOD
                m[i][j] = (m[i][j] + m[i - 1][j]) % MOD
                m[i][j] = (m[i][j] - m[i - 1][j - i - 1])
                if (m[i][j] < 0) {
                    m[i][j] += MOD
                }
            }
            if (r[ri][0] == i) {
                t = m[i][r[ri][1]].toLong()
                if (t == 0L) {
                    return 0
                }
                m[i].fill(0)
                m[i][r[ri][1]] = 1
                a = (a * t) % MOD
                ri++
            }
        }
        return a.toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
