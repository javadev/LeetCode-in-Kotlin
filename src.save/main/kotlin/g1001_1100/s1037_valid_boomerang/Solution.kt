package g1001_1100.s1037_valid_boomerang

// #Easy #Array #Math #Geometry #2023_05_26_Time_126_ms_(100.00%)_Space_34.8_MB_(60.00%)

class Solution {
    fun isBoomerang(points: Array<IntArray>): Boolean {
        return (
            (points[1][1] - points[0][1]) * (points[2][0] - points[0][0])
                != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0])
            )
    }
}
