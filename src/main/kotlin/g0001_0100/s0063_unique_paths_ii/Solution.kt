package g0001_0100.s0063_unique_paths_ii

// #Medium #Array #Dynamic_Programming #Matrix #Dynamic_Programming_I_Day_15
// #Top_Interview_150_Multidimensional_DP #2023_07_10_Time_151_ms_(81.94%)_Space_34.3_MB_(94.44%)

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
