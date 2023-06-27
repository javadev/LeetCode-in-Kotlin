package g0901_1000.s0934_shortest_bridge

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Graph_Theory_I_Day_6_Matrix_Related_Problems
// #2023_04_27_Time_301_ms_(80.95%)_Space_77.9_MB_(9.52%)

class Solution {
    private class Pair(var x: Int, var y: Int)

    private val dirs = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1))

    fun shortestBridge(grid: Array<IntArray>): Int {
        val q: ArrayDeque<Pair> = ArrayDeque()
        var flag = false
        val visited = Array(grid.size) {
            BooleanArray(
                grid[0].size
            )
        }
        var i = 0
        while (i < grid.size && !flag) {
            var j = 0
            while (j < grid[i].size && !flag) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, visited, q)
                    flag = true
                }
                j++
            }
            i++
        }
        var level = -1
        while (q.isNotEmpty()) {
            var size: Int = q.size
            level++
            while (size-- > 0) {
                val rem = q.removeFirst()
                for (dir in dirs) {
                    val newrow = rem.x + dir[0]
                    val newcol = rem.y + dir[1]
                    if (newrow >= 0 && newcol >= 0 && newrow < grid.size && newcol < grid[0].size &&
                        !visited[newrow][newcol]
                    ) {
                        if (grid[newrow][newcol] == 1) {
                            return level
                        }
                        q.add(Pair(newrow, newcol))
                        visited[newrow][newcol] = true
                    }
                }
            }
        }
        return -1
    }

    private fun dfs(grid: Array<IntArray>, row: Int, col: Int, visited: Array<BooleanArray>, q: ArrayDeque<Pair>) {
        visited[row][col] = true
        q.add(Pair(row, col))
        for (dir in dirs) {
            val newrow = row + dir[0]
            val newcol = col + dir[1]
            if (newrow >= 0 && newcol >= 0 && newrow < grid.size && newcol < grid[0].size &&
                !visited[newrow][newcol] && grid[newrow][newcol] == 1
            ) {
                dfs(grid, newrow, newcol, visited, q)
            }
        }
    }
}
