package g0501_0600.s0593_valid_square

// #Medium #Math #Geometry #2023_02_01_Time_161_ms_(83.33%)_Space_35_MB_(66.67%)

class Solution {
    fun validSquare(p1: IntArray, p2: IntArray, p3: IntArray, p4: IntArray): Boolean {
        val distancesSquared = IntArray(6)
        distancesSquared[0] = getDistanceSquared(p1, p2)
        distancesSquared[1] = getDistanceSquared(p1, p3)
        distancesSquared[2] = getDistanceSquared(p1, p4)
        distancesSquared[3] = getDistanceSquared(p2, p3)
        distancesSquared[4] = getDistanceSquared(p2, p4)
        distancesSquared[5] = getDistanceSquared(p3, p4)
        distancesSquared.sort()
        if (distancesSquared[0] == 0) {
            return false
        }
        if (distancesSquared[0] != distancesSquared[3]) {
            return false
        }
        return if (distancesSquared[4] != distancesSquared[5]) {
            false
        } else distancesSquared[5] == 2 * distancesSquared[0]
    }

    private fun getDistanceSquared(p1: IntArray, p2: IntArray): Int {
        val deltaX = p2[0] - p1[0]
        val deltaY = p2[1] - p1[1]
        return deltaX * deltaX + deltaY * deltaY
    }
}
