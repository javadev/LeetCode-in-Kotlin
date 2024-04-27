package g3101_3200.s3111_minimum_rectangles_to_cover_points

// #Medium #Array #Sorting #Greedy #2024_04_27_Time_701_ms_(96.15%)_Space_115.6_MB_(32.69%)

class Solution {
    fun minRectanglesToCoverPoints(points: Array<IntArray>, w: Int): Int {
        points.sortWith { a: IntArray, b: IntArray -> a[0] - b[0] }
        var res = 0
        var last = -1
        for (a in points) {
            if (a[0] > last) {
                res++
                last = a[0] + w
            }
        }
        return res
    }
}
