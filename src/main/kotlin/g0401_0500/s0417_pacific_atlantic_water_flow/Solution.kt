package g0401_0500.s0417_pacific_atlantic_water_flow

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Graph_Theory_I_Day_4_Matrix_Related_Problems #Level_2_Day_10_Graph/BFS/DFS #Udemy_Graph
// #2022_12_06_Time_319_ms_(100.00%)_Space_37.5_MB_(100.00%)

class Solution {
    private var col = 0
    private var row = 0
    fun pacificAtlantic(matrix: Array<IntArray>): List<List<Int>> {
        val res: MutableList<List<Int>> = ArrayList()
        if (matrix.size == 0) {
            return res
        }
        col = matrix.size
        row = matrix[0].size
        val pacific = Array(col) {
            BooleanArray(
                row,
            )
        }
        val atlantic = Array(col) {
            BooleanArray(
                row,
            )
        }
        for (i in 0 until col) {
            dfs(i, 0, matrix, pacific)
            dfs(i, row - 1, matrix, atlantic)
        }
        for (i in 0 until row) {
            dfs(0, i, matrix, pacific)
            dfs(col - 1, i, matrix, atlantic)
        }
        for (i in 0 until col) {
            for (j in 0 until row) {
                if (pacific[i][j] && atlantic[i][j]) {
                    val temp: MutableList<Int> = ArrayList()
                    temp.add(i)
                    temp.add(j)
                    res.add(temp)
                }
            }
        }
        return res
    }

    private fun dfs(i: Int, j: Int, matrix: Array<IntArray>, visited: Array<BooleanArray>) {
        if (i < 0 || j < 0 || i >= matrix.size || j >= matrix[0].size || visited[i][j]) {
            return
        }
        visited[i][j] = true
        if (i < col - 1 && matrix[i][j] <= matrix[i + 1][j]) {
            dfs(i + 1, j, matrix, visited)
        }
        if (i > 0 && matrix[i][j] <= matrix[i - 1][j]) {
            dfs(i - 1, j, matrix, visited)
        }
        if (j < row - 1 && matrix[i][j] <= matrix[i][j + 1]) {
            dfs(i, j + 1, matrix, visited)
        }
        if (j > 0 && matrix[i][j] <= matrix[i][j - 1]) {
            dfs(i, j - 1, matrix, visited)
        }
    }
}
