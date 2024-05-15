package g3101_3200.s3143_maximum_points_inside_the_square

// #Medium #Array #String #Hash_Table #Sorting #Binary_Search
// #2024_05_15_Time_650_ms_(59.52%)_Space_93.5_MB_(54.76%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxPointsInsideSquare(points: Array<IntArray>, s: String): Int {
        val tags = IntArray(26)
        tags.fill(Int.MAX_VALUE)
        var secondMin = Int.MAX_VALUE
        for (i in s.indices) {
            val dist = max(abs(points[i][0]), abs(points[i][1]))
            val c = s[i]
            if (tags[c.code - 'a'.code] == Int.MAX_VALUE) {
                tags[c.code - 'a'.code] = dist
            } else if (dist < tags[c.code - 'a'.code]) {
                secondMin = min(secondMin, tags[c.code - 'a'.code])
                tags[c.code - 'a'.code] = dist
            } else {
                secondMin = min(secondMin, dist)
            }
        }
        var count = 0
        for (dist in tags) {
            if (dist < secondMin) {
                count++
            }
        }
        return count
    }
}
