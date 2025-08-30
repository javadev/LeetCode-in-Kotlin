package g3601_3700.s3661_maximum_walls_destroyed_by_robots

// #Hard #Weekly_Contest_464 #2025_08_29_Time_146_ms_(100.00%)_Space_93.92_MB_(16.67%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxWalls(robots: IntArray, distance: IntArray, walls: IntArray): Int {
        if (robots.size == 1) {
            var a = 0
            var b = 0
            for (wall in walls) {
                if (wall < robots[0] - distance[0] || wall > robots[0] + distance[0]) {
                    continue
                }
                if (wall < robots[0]) {
                    a++
                } else if (wall > robots[0]) {
                    b++
                } else {
                    a++
                    b++
                }
            }
            return max(a, b)
        }
        val arr = Array<IntArray>(robots.size) { i -> intArrayOf(robots[i], distance[i]) }
        arr.sortWith { a: IntArray, b: IntArray -> a[0] - b[0] }
        walls.sort()
        var a = 0
        var b = 0
        var i = 0
        var j = 0
        while (i < walls.size && walls[i] < arr[j][0] - arr[j][1]) {
            i++
        }
        while (i < walls.size && walls[i] <= arr[j][0]) {
            a++
            i++
        }
        if (i > 0 && walls[i - 1] == arr[j][0]) {
            i--
        }
        while (i < walls.size && walls[i] <= arr[j][0] + arr[j][1] && walls[i] < arr[j + 1][0]) {
            b++
            i++
        }
        j++
        while (j < arr.size) {
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
            j++
            val bNext = max(a, b) + r
            a = aNext
            b = bNext
        }
        return max(a, b)
    }
}
