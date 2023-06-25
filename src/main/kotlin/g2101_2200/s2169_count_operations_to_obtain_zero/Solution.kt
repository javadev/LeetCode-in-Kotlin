package g2101_2200.s2169_count_operations_to_obtain_zero

// #Easy #Math #Simulation
@Suppress("NAME_SHADOWING")
class Solution {
    fun countOperations(num1: Int, num2: Int): Int {
        var num1 = num1
        var num2 = num2
        var ans = 0
        while (num1 * num2 != 0) {
            if (num1 >= num2) {
                ans += num1 / num2
                num1 = num1 % num2
            } else {
                ans += num2 / num1
                num2 = num2 % num1
            }
        }
        return ans
    }
}
