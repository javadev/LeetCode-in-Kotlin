package g1401_1500.s1404_number_of_steps_to_reduce_a_number_in_binary_representation_to_one

// #Medium #String #Bit_Manipulation #2023_06_07_Time_144_ms_(100.00%)_Space_33.1_MB_(100.00%)

class Solution {
    fun numSteps(s: String): Int {
        var steps = 0
        var carry = 0
        for (i in s.length - 1 downTo 1) {
            if (carry == 0) {
                if (s[i] == '1') {
                    steps += 2
                    carry = 1
                } else {
                    steps++
                }
            } else {
                if (s[i] == '0') {
                    steps += 2
                } else {
                    steps++
                }
            }
        }
        return steps + carry
    }
}
