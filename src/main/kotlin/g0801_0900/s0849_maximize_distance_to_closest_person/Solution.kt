package g0801_0900.s0849_maximize_distance_to_closest_person

// #Medium #Array #2023_03_29_Time_196_ms_(88.46%)_Space_37.6_MB_(76.92%)

class Solution {
    private var maxDist = 0
    fun maxDistToClosest(seats: IntArray): Int {
        for (i in seats.indices) {
            if (seats[i] == 0) {
                extend(seats, i)
            }
        }
        return maxDist
    }

    private fun extend(seats: IntArray, position: Int) {
        var left = position - 1
        var right = position + 1
        var leftMinDistance = 1
        while (left >= 0) {
            if (seats[left] == 0) {
                leftMinDistance++
                left--
            } else {
                break
            }
        }
        var rightMinDistance = 1
        while (right < seats.size) {
            if (seats[right] == 0) {
                rightMinDistance++
                right++
            } else {
                break
            }
        }
        val maxReach: Int = when (position) {
            0 -> rightMinDistance
            seats.size - 1 -> leftMinDistance
            else -> leftMinDistance.coerceAtMost(rightMinDistance)
        }
        maxDist = maxDist.coerceAtLeast(maxReach)
    }
}
