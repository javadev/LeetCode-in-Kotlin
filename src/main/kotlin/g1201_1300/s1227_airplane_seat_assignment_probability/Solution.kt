package g1201_1300.s1227_airplane_seat_assignment_probability

// #Medium #Dynamic_Programming #Math #Brainteaser #Probability_and_Statistics
class Solution {
    fun nthPersonGetsNthSeat(n: Int): Double {
        return if (n == 1) {
            1.0
        } else 0.5
    }
}
