package g1201_1300.s1227_airplane_seat_assignment_probability

// #Medium #Dynamic_Programming #Math #Brainteaser #Probability_and_Statistics
// #2023_06_09_Time_135_ms_(100.00%)_Space_33.3_MB_(100.00%)

class Solution {
    fun nthPersonGetsNthSeat(n: Int): Double {
        return if (n == 1) {
            1.0
        } else {
            0.5
        }
    }
}
