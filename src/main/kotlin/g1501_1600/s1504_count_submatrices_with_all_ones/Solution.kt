package g1501_1600.s1504_count_submatrices_with_all_ones

// #Medium #Array #Dynamic_Programming #Matrix #Stack #Monotonic_Stack
class Solution {
    fun numSubmat(mat: Array<IntArray>): Int {
        val dp = Array(mat.size) { IntArray(mat[0].size) }
        for (i in mat.indices) {
            var c = 0
            for (j in mat[0].indices.reversed()) {
                if (mat[i][j] == 1) {
                    c++
                } else {
                    c = 0
                }
                dp[i][j] = c
            }
        }
        var ans = 0
        for (i in mat.indices) {
            for (j in mat[0].indices) {
                var x = Int.MAX_VALUE
                for (k in i until mat.size) {
                    x = Math.min(x, dp[k][j])
                    ans += x
                }
            }
        }
        return ans
    }
}
