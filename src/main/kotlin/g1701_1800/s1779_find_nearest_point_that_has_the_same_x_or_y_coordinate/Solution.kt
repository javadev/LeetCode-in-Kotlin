package g1701_1800.s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate

// #Easy #Array #Programming_Skills_I_Day_3_Conditional_Statements
class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var nearestManDistance = Int.MAX_VALUE
        var result = -1
        for (i in points.indices) {
            val point = points[i]
            if (point[0] == x || point[1] == y) {
                val distance = Math.abs(point[0] - x) + Math.abs(point[1] - y)
                if (distance < nearestManDistance) {
                    result = i
                    nearestManDistance = distance
                }
            }
        }
        return result
    }
}
