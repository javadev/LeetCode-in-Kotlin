package g1501_1600.s1503_last_moment_before_all_ants_fall_out_of_a_plank

// #Medium #Array #Simulation #Brainteaser #2023_06_12_Time_253_ms_(100.00%)_Space_39.6_MB_(100.00%)

class Solution {
    fun getLastMoment(n: Int, left: IntArray, right: IntArray): Int {
        var highestLeft = 0
        var smallestRight = Int.MAX_VALUE
        for (i in 0..n + 1) {
            if (i < left.size && left[i] > highestLeft) {
                highestLeft = left[i]
            }
            if (i < right.size && right[i] < smallestRight) {
                smallestRight = right[i]
            }
        }
        if (left.isNotEmpty() && right.isEmpty()) {
            return highestLeft
        }
        return if (right.isNotEmpty() && left.isEmpty()) {
            Math.abs(smallestRight - n)
        } else Math.max(highestLeft, Math.abs(smallestRight - n))
    }
}
