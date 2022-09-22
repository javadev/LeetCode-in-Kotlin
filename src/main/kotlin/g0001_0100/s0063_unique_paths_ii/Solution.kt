package g0001_0100.s0063_unique_paths_ii

// #Medium #Array #Dynamic_Programming #Matrix #Dynamic_Programming_I_Day_15
// #2022_09_22_Time_187_ms_(84.62%)_Space_43.5_MB_(6.15%)

class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        // if start point has obstacle, there's no path
        if (obstacleGrid[0][0] == 1) {
            return 0
        }
        obstacleGrid[0][0] = 1
        val m = obstacleGrid.size
        val n: Int = obstacleGrid[0].size
        for (i in 1 until m) {
            if (obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = 0
            } else {
                obstacleGrid[i][0] = obstacleGrid[i - 1][0]
            }
        }
        for (j in 1 until n) {
            if (obstacleGrid[0][j] == 1) {
                obstacleGrid[0][j] = 0
            } else {
                obstacleGrid[0][j] = obstacleGrid[0][j - 1]
            }
        }
        for (i in 1 until m) {
            for (j in 1 until n) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1]
                }
            }
        }
        return obstacleGrid[m - 1][n - 1]
    }
}
