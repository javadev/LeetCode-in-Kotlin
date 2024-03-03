package g3001_3100.s3025_find_the_number_of_ways_to_place_people_i

// #Medium #Array #Math #Sorting #Enumeration #Geometry
// #2024_02_29_Time_5_ms_(99.84%)_Space_44.7_MB_(30.13%)

class Solution {
    fun numberOfPairs(points: Array<IntArray>): Int {
        points.sortWith { a: IntArray, b: IntArray -> if (a[0] == b[0]) b[1] - a[1] else a[0] - b[0] }
        var cnt = 0
        for (i in points.indices) {
            var bot = Int.MIN_VALUE
            var top = points[i][1]
            for (j in i + 1 until points.size) {
                val y1 = points[j][1]
                if (y1 <= top && y1 > bot) {
                    cnt++
                    bot = y1
                    if (y1 == top) {
                        top--
                    }
                }
            }
        }
        return cnt
    }
}
