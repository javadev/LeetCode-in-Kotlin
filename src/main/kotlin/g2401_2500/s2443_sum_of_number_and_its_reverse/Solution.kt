package g2401_2500.s2443_sum_of_number_and_its_reverse

// #Medium #Math #Enumeration
class Solution {
    fun sumOfNumberAndReverse(num: Int): Boolean {
        for (i in 0..num) {
            var n = i
            var r = 0
            while (n != 0) {
                r = r * 10 + n % 10
                n = n / 10
            }
            if (r + i == num) {
                return true
            }
        }
        return false
    }
}
