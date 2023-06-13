package g1501_1600.s1568_minimum_number_of_days_to_disconnect_island

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Strongly_Connected_Component
class Solution {
    private val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))
    fun minDays(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var numOfIslands = 0
        var hasArticulationPoint = false
        var color = 1
        var minIslandSize = m * n
        val time = Array(m) { IntArray(n) }
        val low = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    numOfIslands++
                    color++
                    val articulationPoints: MutableList<Int> = ArrayList()
                    val islandSize = IntArray(1)
                    tarjan(i, j, -1, -1, 0, time, low, grid, articulationPoints, color, islandSize)
                    minIslandSize = Math.min(minIslandSize, islandSize[0])
                    if (!articulationPoints.isEmpty()) {
                        hasArticulationPoint = true
                    }
                }
            }
        }
        if (numOfIslands >= 2) {
            return 0
        }
        if (numOfIslands == 0) {
            return 0
        }
        if (numOfIslands == 1 && minIslandSize == 1) {
            return 1
        }
        return if (hasArticulationPoint) 1 else 2
    }

    private fun tarjan(
        x: Int,
        y: Int,
        prex: Int,
        prey: Int,
        time: Int,
        times: Array<IntArray>,
        lows: Array<IntArray>,
        grid: Array<IntArray>,
        articulationPoints: MutableList<Int>,
        color: Int,
        islandSize: IntArray
    ) {
        times[x][y] = time
        lows[x][y] = time
        grid[x][y] = color
        islandSize[0]++
        var children = 0
        for (dir in dirs) {
            val nx = x + dir[0]
            val ny = y + dir[1]
            if (nx < 0 || ny < 0 || nx >= grid.size || ny >= grid[0].size) {
                continue
            }
            if (grid[nx][ny] == 1) {
                children++
                tarjan(
                    nx,
                    ny,
                    x,
                    y,
                    time + 1,
                    times,
                    lows,
                    grid,
                    articulationPoints,
                    color,
                    islandSize
                )
                lows[x][y] = Math.min(lows[x][y], lows[nx][ny])
                if (prex != -1 && lows[nx][ny] >= time) {
                    articulationPoints.add(x * grid.size + y)
                }
            } else if ((nx != prex || ny != prey) && grid[nx][ny] != 0) {
                lows[x][y] = Math.min(lows[x][y], times[nx][ny])
            }
        }
        if (prex == -1 && children > 1) {
            articulationPoints.add(x * grid.size + y)
        }
    }
}
