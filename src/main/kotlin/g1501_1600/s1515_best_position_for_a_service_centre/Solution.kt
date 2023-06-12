package g1501_1600.s1515_best_position_for_a_service_centre

// #Hard #Math #Geometry #Randomized #2023_06_12_Time_183_ms_(100.00%)_Space_34.5_MB_(100.00%)

class Solution {
    fun getMinDistSum(positions: Array<IntArray>): Double {
        var minX = Int.MAX_VALUE.toDouble()
        var minY = Int.MAX_VALUE.toDouble()
        var maxX = Int.MIN_VALUE.toDouble()
        var maxY = Int.MIN_VALUE.toDouble()
        for (pos in positions) {
            maxX = Math.max(maxX, pos[0].toDouble())
            maxY = Math.max(maxY, pos[1].toDouble())
            minX = Math.min(minX, pos[0].toDouble())
            minY = Math.min(minY, pos[1].toDouble())
        }
        var xMid = minX + (maxX - minX) / 2
        var yMid = minY + (maxY - minY) / 2
        var jump = Math.max(maxX - minX, maxY - minY)
        var ans = getTotalDistance(xMid, yMid, positions)
        while (jump > 0.00001) {
            val list = getFourCorners(xMid, yMid, jump)
            var found = false
            for (point in list) {
                val pointAns = getTotalDistance(point[0], point[1], positions)
                if (ans > pointAns) {
                    xMid = point[0]
                    yMid = point[1]
                    ans = pointAns
                    found = true
                }
            }
            if (!found) {
                jump = jump / 2
            }
        }
        return ans
    }

    private fun getFourCorners(xMid: Double, yMid: Double, jump: Double): List<DoubleArray> {
        val list: MutableList<DoubleArray> = ArrayList()
        list.add(doubleArrayOf(xMid - jump, yMid + jump))
        list.add(doubleArrayOf(xMid + jump, yMid + jump))
        list.add(doubleArrayOf(xMid - jump, yMid - jump))
        list.add(doubleArrayOf(xMid + jump, yMid - jump))
        return list
    }

    private fun getTotalDistance(x: Double, y: Double, positions: Array<IntArray>): Double {
        var totalDistanceSum = 0.0
        for (point in positions) {
            val xDistance = x - point[0]
            val yDistance = y - point[1]
            totalDistanceSum += Math.sqrt(xDistance * xDistance + yDistance * yDistance)
        }
        return totalDistanceSum
    }
}
