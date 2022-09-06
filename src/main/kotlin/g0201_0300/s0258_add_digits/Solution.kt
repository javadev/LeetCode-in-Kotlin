package g0201_0300.s0258_add_digits

// #Easy #Math #Simulation #Number_Theory #2022_07_05_Time_1_ms_(100.00%)_Space_39.3_MB_(98.44%)
class Solution {
    fun addDigits(num: Int): Int {
        if (num == 0) {
            return 0
        }
        return if (num % 9 == 0) {
            9
        } else num % 9
    }
}
