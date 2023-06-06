package g1301_1400.s1342_number_of_steps_to_reduce_a_number_to_zero

// #Easy #Math #Bit_Manipulation #2023_06_06_Time_124_ms_(83.18%)_Space_33.1_MB_(77.73%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun numberOfSteps(num: Int): Int {
        var num = num
        var steps = 0
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2
            } else {
                num--
            }
            steps++
        }
        return steps
    }
}
