package g1701_1800.s1706_where_will_the_ball_fall

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Matrix #Simulation
// #Level_2_Day_1_Implementation/Simulation
class Solution {
    fun findBall(grid: Array<IntArray>): IntArray {
        val m = grid.size
        val n = grid[0].size
        val res = IntArray(n)
        for (j in 0 until n) {
            var currentJ = j
            var currentI = 0
            while (currentJ < n && currentI < m) {
                if (grid[currentI][currentJ] == 1) {
                    currentJ++
                    if (currentJ < n && grid[currentI][currentJ] == 1) {
                        currentI++
                    } else {
                        break
                    }
                } else {
                    currentJ--
                    if (currentJ >= 0 && grid[currentI][currentJ] == -1) {
                        currentI++
                    } else {
                        break
                    }
                }
            }
            if (currentI == m) {
                res[j] = currentJ
            } else {
                res[j] = -1
            }
        }
        return res
    }
}
