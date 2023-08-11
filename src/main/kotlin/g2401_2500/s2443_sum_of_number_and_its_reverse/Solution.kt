package g2401_2500.s2443_sum_of_number_and_its_reverse

// #Medium #Math #Enumeration #2023_07_05_Time_216_ms_(100.00%)_Space_33.5_MB_(100.00%)

class Solution {
    fun sumOfNumberAndReverse(num: Int): Boolean {
        for (i in 0..num) {
            var n = i
            var r = 0
            while (n != 0) {
                r = r * 10 + n % 10
                n /= 10
            }
            if (r + i == num) {
                return true
            }
        }
        return false
    }
}
