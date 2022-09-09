package g0101_0200.s0200_number_of_islands

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Depth_First_Search
// #Breadth_First_Search #Matrix #Union_Find
// #Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_1_Matrix_Related_Problems #Level_1_Day_9_Graph/BFS/DFS #Udemy_Graph
// #2022_09_09_Time_252_ms_(95.41%)_Space_52.4_MB_(86.52%)

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var islands = 0
        if (grid.isNotEmpty() && grid[0].isNotEmpty()) {
            for (i in grid.indices) {
                for (j in grid[0].indices) {
                    if (grid[i][j] == '1') {
                        dfs(grid, i, j)
                        islands++
                    }
                }
            }
        }
        return islands
    }

    private fun dfs(grid: Array<CharArray>, x: Int, y: Int) {
        if (x < 0 || grid.size <= x || y < 0 || grid[0].size <= y || grid[x][y] !== '1') {
            return
        }
        grid[x][y] = 'x'
        dfs(grid, x + 1, y)
        dfs(grid, x - 1, y)
        dfs(grid, x, y + 1)
        dfs(grid, x, y - 1)
    }
}
