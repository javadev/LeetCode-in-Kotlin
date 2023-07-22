package g1901_2000.s1981_minimize_the_difference_between_target_and_chosen_elements

// #Medium #Array #Dynamic_Programming #Matrix
// #2023_06_21_Time_588_ms_(100.00%)_Space_44.8_MB_(100.00%)

class Solution {
    fun minimizeTheDifference(mat: Array<IntArray>, target: Int): Int {
        val m = mat.size
        val seen = Array(m) { BooleanArray(m * 70 + 1) }
        dfs(0, mat, 0, seen)
        var i = 0
        while (true) {
            var j = 0
            var sign = 1
            while (j < 2) {
                val k = target - i * sign
                if (k >= 0 && k <= m * 70 && seen[m - 1][k]) {
                    return i
                }
                j++
                sign *= -1
            }
            i++
        }
    }

    private fun dfs(i: Int, mat: Array<IntArray>, sum: Int, seen: Array<BooleanArray>) {
        if (i == mat.size) {
            return
        }
        for (j in mat[i].indices) {
            if (!seen[i][sum + mat[i][j]]) {
                seen[i][sum + mat[i][j]] = true
                dfs(i + 1, mat, sum + mat[i][j], seen)
            }
        }
    }
}
