package g0101_0200.s0200_number_of_islands

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Depth_First_Search
// #Breadth_First_Search #Matrix #Union_Find
// #Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_1_Matrix_Related_Problems #Level_1_Day_9_Graph/BFS/DFS #Udemy_Graph
// #2022_09_08_Time_428_ms_(55.71%)_Space_59_MB_(51.71%)

class Solution {
    fun numIslands(grid: Array<CharArray>?): Int {
        if (grid == null || grid.size == 0) {
            return 0
        }
        var count = 0
        val m = grid.size
        val n: Int = grid[0].size
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == '1') {
                    count++
                    dfs(grid, i, j, m, n)
                }
            }
        }
        return count
    }

    fun dfs(grid: Array<CharArray>, i: Int, j: Int, m: Int, n: Int) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return
        }
        grid[i][j] = '0'
        dfs(grid, i + 1, j, m, n)
        dfs(grid, i, j + 1, m, n)
        dfs(grid, i - 1, j, m, n)
        dfs(grid, i, j - 1, m, n)
    }
}
