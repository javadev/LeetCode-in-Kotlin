package g1001_1100.s1020_number_of_enclaves

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #Graph_Theory_I_Day_3_Matrix_Related_Problems
// #2024_05_02_Time_283_ms_(90.70%)_Space_57.5_MB_(65.12%)

class Solution {
    private fun walk(a: Array<IntArray>, visited: Array<BooleanArray>, x: Int, y: Int) {
        if (x >= a.size || x < 0 || y >= a[0].size || y < 0) {
            return
        }
        if (visited[x][y]) {
            return
        }
        if (a[x][y] == 0) {
            return
        }
        visited[x][y] = true
        walk(a, visited, x - 1, y)
        walk(a, visited, x, y - 1)
        walk(a, visited, x, y + 1)
        walk(a, visited, x + 1, y)
    }

    fun numEnclaves(a: Array<IntArray>): Int {
        val n = a.size
        val m = a[0].size
        val visited = Array(n) { BooleanArray(m) }
        for (i in 0 until n) {
            walk(a, visited, i, 0)
            walk(a, visited, i, m - 1)
        }
        for (j in 0 until m) {
            walk(a, visited, 0, j)
            walk(a, visited, n - 1, j)
        }
        var unreachables = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (a[i][j] == 1 && !visited[i][j]) {
                    ++unreachables
                }
            }
        }
        return unreachables
    }
}
