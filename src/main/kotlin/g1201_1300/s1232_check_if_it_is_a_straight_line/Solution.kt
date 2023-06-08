package g1201_1300.s1232_check_if_it_is_a_straight_line

// #Easy #Array #Math #Geometry #Programming_Skills_I_Day_5_Function
class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        val deltaX1 = coordinates[0][0] - coordinates[1][0]
        val deltaY1 = coordinates[0][1] - coordinates[1][1]
        val prev = coordinates[1]
        for (i in 2 until coordinates.size) {
            val point = coordinates[i]
            val deltaX2 = point[0] - prev[0]
            val deltaY2 = point[1] - prev[1]
            if (deltaX1 * deltaY2 != deltaX2 * deltaY1) {
                return false
            }
        }
        return true
    }
}
