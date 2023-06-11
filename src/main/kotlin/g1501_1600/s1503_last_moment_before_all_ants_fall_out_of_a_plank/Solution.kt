package g1501_1600.s1503_last_moment_before_all_ants_fall_out_of_a_plank

// #Medium #Array #Simulation #Brainteaser
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
        if (left.size != 0 && right.size == 0) {
            return highestLeft
        }
        return if (right.size != 0 && left.size == 0) {
            Math.abs(smallestRight - n)
        } else Math.max(highestLeft, Math.abs(smallestRight - n))
    }
}
