package g0401_0500.s0498_diagonal_traverse

// #Medium #Array #Matrix #Simulation #2023_01_05_Time_430_ms_(61.54%)_Space_72.5_MB_(50.00%)

class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val m = mat.size
        val n = mat[0].size
        val output = IntArray(m * n)
        var idx = 0
        for (diag in 0..m + n - 2) {
            if (diag % 2 == 0) {
                for (k in Math.max(0, diag - m + 1)..Math.min(diag, n - 1)) {
                    output[idx++] = mat[diag - k][k]
                }
            } else {
                for (k in Math.max(0, diag - n + 1)..Math.min(diag, m - 1)) {
                    output[idx++] = mat[k][diag - k]
                }
            }
        }
        return output
    }
}
