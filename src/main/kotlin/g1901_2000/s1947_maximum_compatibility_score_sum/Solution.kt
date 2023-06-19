package g1901_2000.s1947_maximum_compatibility_score_sum

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
class Solution {
    private lateinit var dp: Array<IntArray>
    private var m = 0
    private lateinit var memo: Array<IntArray>

    fun maxCompatibilitySum(students: Array<IntArray>, mentors: Array<IntArray>): Int {
        val n = students[0].size
        m = students.size
        dp = Array(m) { IntArray(m) }
        for (i in 0 until m) {
            for (j in 0 until m) {
                var tmp = 0
                for (k in 0 until n) {
                    tmp += if (students[i][k] == mentors[j][k]) 1 else 0
                }
                dp[i][j] = tmp
            }
        }
        memo = Array(m) { IntArray((1 shl m) + 1) }
        for (x in memo) {
            x.fill(-1)
        }
        return dp(0, 0)
    }

    private fun dp(idx: Int, mask: Int): Int {
        if (idx == m) {
            return 0
        }
        if (memo[idx][mask] != -1) {
            return memo[idx][mask]
        }
        var ans = 0
        for (i in 0 until m) {
            if (mask and (1 shl i) == 0) {
                ans = Math.max(ans, dp[idx][i] + dp(idx + 1, mask or (1 shl i)))
            }
        }
        memo[idx][mask] = ans
        return ans
    }
}
