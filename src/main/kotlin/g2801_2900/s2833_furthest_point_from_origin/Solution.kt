package g2801_2900.s2833_furthest_point_from_origin

// #Easy #Array #Counting #2023_12_18_Time_160_ms_(81.25%)_Space_35.3_MB_(25.00%)

import kotlin.math.abs

class Solution {
    fun furthestDistanceFromOrigin(moves: String): Int {
        var count = 0
        var res = 0
        for (i in moves.indices) {
            if (moves[i] == 'L') {
                res -= 1
            } else if (moves[i] == 'R') {
                res += 1
            } else {
                count++
            }
        }
        return abs(res) + count
    }
}
