package g0201_0300.s0258_add_digits

// #Easy #Math #Simulation #Number_Theory #2022_11_01_Time_234_ms_(71.64%)_Space_34.1_MB_(74.63%)

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
