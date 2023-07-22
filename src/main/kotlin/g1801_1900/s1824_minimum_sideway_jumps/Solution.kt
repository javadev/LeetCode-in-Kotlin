package g1801_1900.s1824_minimum_sideway_jumps

// #Medium #Array #Dynamic_Programming #Greedy
// #2023_06_20_Time_726_ms_(100.00%)_Space_98.6_MB_(100.00%)

class Solution {
    fun minSideJumps(obstacles: IntArray): Int {
        var sideJumps = 0
        var currLane = 2
        var i = 0
        while (i < obstacles.size - 1) {
            if (obstacles[i + 1] == currLane) {
                if (obstacles[i] != 0) {
                    currLane = getNextLane(obstacles[i], obstacles[i + 1])
                } else {
                    var j = i + 2
                    while (j < obstacles.size &&
                        (obstacles[j] == 0 || obstacles[j] == obstacles[i + 1])
                    ) {
                        j++
                    }
                    if (j < obstacles.size) {
                        currLane = getNextLane(obstacles[i + 1], obstacles[j])
                    } else {
                        i = obstacles.size - 1
                    }
                }
                sideJumps++
            }
            i++
        }
        return sideJumps
    }

    private fun getNextLane(nextObstacle: Int, nextNextObstacle: Int): Int {
        if (nextObstacle == 2 && nextNextObstacle == 3 || nextObstacle == 3 && nextNextObstacle == 2) {
            return 1
        }
        return if (nextObstacle == 1 && nextNextObstacle == 3 || nextObstacle == 3 && nextNextObstacle == 1
        ) {
            2
        } else {
            3
        }
    }
}
