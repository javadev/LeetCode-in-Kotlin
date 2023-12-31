package g2901_3000.s2946_matrix_similarity_after_cyclic_shifts

// #Easy #Array #Math #Matrix #Simulation #2023_12_31_Time_210_ms_(75.00%)_Space_44_MB_(36.54%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun areSimilar(mat: Array<IntArray>, k: Int): Boolean {
        var k = k
        val m = mat.size
        val n = mat[0].size
        k %= n
        for (i in 0 until m) {
            for (j in 0 until n) {
                if ((i and 1) != 0) {
                    if (mat[i][j] != mat[i][(j - k + n) % n]) {
                        return false
                    }
                } else {
                    if (mat[i][j] != mat[i][(j + k) % n]) {
                        return false
                    }
                }
            }
        }
        return true
    }
}
