package g0501_0600.s0542_01_matrix

// #Medium #Array #Dynamic_Programming #Breadth_First_Search #Matrix
// #Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_5_Matrix_Related_Problems
// #2023_01_17_Time_441_ms_(94.06%)_Space_54_MB_(78.22%)

class Solution {
    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val dist = Array(mat.size) { IntArray(mat[0].size) }
        for (i in mat.indices) {
            dist[i].fill(Int.MAX_VALUE - 100000)
        }
        for (i in mat.indices) {
            for (j in mat[0].indices) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0
                } else {
                    if (i > 0) {
                        dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1)
                    }
                    if (j > 0) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1)
                    }
                }
            }
        }
        for (i in mat.indices.reversed()) {
            for (j in mat[0].indices.reversed()) {
                if (i < mat.size - 1) {
                    dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1)
                }
                if (j < mat[0].size - 1) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1)
                }
            }
        }
        return dist
    }
}
