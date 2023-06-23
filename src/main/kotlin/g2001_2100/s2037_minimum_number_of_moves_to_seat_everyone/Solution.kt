package g2001_2100.s2037_minimum_number_of_moves_to_seat_everyone

// #Easy #Array #Sorting #2023_06_23_Time_189_ms_(80.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        var ans = 0
        seats.sort()
        students.sort()
        for (i in seats.indices) {
            ans += Math.abs(seats[i] - students[i])
        }
        return ans
    }
}
