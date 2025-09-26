package g3601_3700.s3661_maximum_walls_destroyed_by_robots

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search #Weekly_Contest_464
// #2025_08_30_Time_147_ms_(100.00%)_Space_71.82_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxWalls(robots: IntArray, distance: IntArray, walls: IntArray): Int {
        if (robots.size == 1) {
            return handleSingleRobot(robots[0], distance[0], walls)
        }
        val arr = buildRobotArray(robots, distance)
        arr.sortWith { a: IntArray, b: IntArray -> if (a[0] == b[0]) (a[1] - b[1]) else (a[0] - b[0]) }
        walls.sort()
        return processMultipleRobots(arr, walls)
    }

    private fun handleSingleRobot(robot: Int, dist: Int, walls: IntArray): Int {
        var left = 0
        var right = 0
        for (wall in walls) {
            if (wall < robot - dist || wall > robot + dist) {
                continue
            }
            if (wall < robot) {
                left++
            } else if (wall > robot) {
                right++
            } else {
                left++
                right++
            }
        }
        return max(left, right)
    }

    private fun buildRobotArray(robots: IntArray, distance: IntArray): Array<IntArray> {
        val arr = Array(robots.size) { IntArray(2) }
        for (i in robots.indices) {
            arr[i][0] = robots[i]
            arr[i][1] = distance[i]
        }
        return arr
    }

    private fun processMultipleRobots(arr: Array<IntArray>, walls: IntArray): Int {
        var a: Int
        var b: Int
        var i = 0
        var j = 0
        i = skipWallsBeforeRange(walls, i, arr[j][0] - arr[j][1])
        a = countWallsUpToRobot(walls, i, arr[j][0])
        i += a
        if (i > 0 && walls[i - 1] == arr[j][0]) {
            i--
        }
        b = countWallsInRange(walls, i, arr[j][0] + arr[j][1], arr[j + 1][0])
        i += b
        j++
        while (j < arr.size) {
            val result = processRobotStep(arr, walls, j, i, a, b)
            a = result[0]
            b = result[1]
            i = result[2]
            j++
        }
        return max(a, b)
    }

    private fun skipWallsBeforeRange(walls: IntArray, i: Int, limit: Int): Int {
        var i = i
        while (i < walls.size && walls[i] < limit) {
            i++
        }
        return i
    }

    private fun countWallsUpToRobot(walls: IntArray, i: Int, robotPos: Int): Int {
        var count = 0
        while (i + count < walls.size && walls[i + count] <= robotPos) {
            count++
        }
        return count
    }

    private fun countWallsInRange(walls: IntArray, i: Int, maxReach: Int, nextRobot: Int): Int {
        var count = 0
        while (i + count < walls.size && walls[i + count] <= maxReach && walls[i + count] < nextRobot) {
            count++
        }
        return count
    }

    private fun processRobotStep(arr: Array<IntArray>, walls: IntArray, j: Int, i: Int, a: Int, b: Int): IntArray {
        var i = i
        var l1 = 0
        var k = i
        while (k < walls.size && walls[k] < arr[j][0] - arr[j][1]) {
            k++
        }
        while (k < walls.size && walls[k] <= arr[j][0]) {
            l1++
            k++
        }
        val nextI = k
        var l2 = l1
        k = i - 1
        while (k >= 0 && walls[k] > arr[j - 1][0] && walls[k] >= arr[j][0] - arr[j][1]) {
            l2++
            k--
        }
        val aNext = max(a + l2, b + l1)
        var r = 0
        val lim =
            if (j < arr.size - 1) {
                min(arr[j + 1][0], arr[j][0] + arr[j][1] + 1)
            } else {
                arr[j][0] + arr[j][1] + 1
            }
        i = if (nextI > 0 && walls[nextI - 1] == arr[j][0]) {
            nextI - 1
        } else {
            nextI
        }
        while (i < walls.size && walls[i] < lim) {
            r++
            i++
        }
        val bNext = max(a, b) + r
        return intArrayOf(aNext, bNext, i)
    }
}
