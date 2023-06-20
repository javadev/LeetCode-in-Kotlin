package g1901_2000.s1905_count_sub_islands

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #Graph_Theory_I_Day_3_Matrix_Related_Problems
// #2023_06_19_Time_866_ms_(100.00%)_Space_81.8_MB_(100.00%)

class Solution {
    private var ans = 0
    fun countSubIslands(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        var count = 0
        for (i in grid2.indices) {
            for (j in grid2[0].indices) {
                if (grid2[i][j] == 1) {
                    ans = 1
                    dfs(grid1, grid2, i, j)
                    count += ans
                }
            }
        }
        return count
    }

    private fun dfs(grid1: Array<IntArray>, grid2: Array<IntArray>, i: Int, j: Int) {
        if (i < 0 || j < 0 || i >= grid1.size || j >= grid1[0].size || grid2[i][j] == 0) {
            return
        }
        if (grid1[i][j] == 0) {
            ans = 0
        }
        grid2[i][j] = 0
        dfs(grid1, grid2, i - 1, j)
        dfs(grid1, grid2, i + 1, j)
        dfs(grid1, grid2, i, j + 1)
        dfs(grid1, grid2, i, j - 1)
    }
}
