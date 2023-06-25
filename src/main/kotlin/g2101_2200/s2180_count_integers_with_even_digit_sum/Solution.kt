package g2101_2200.s2180_count_integers_with_even_digit_sum

// #Easy #Math #Simulation
class Solution {
    fun countEven(n: Int): Int {
        return if (n % 2 == 1) {
            n / 2
        } else {
            var ans = 0
            var num = n
            while (num != 0) {
                ans += num % 10
                num /= 10
            }
            if (ans % 2 == 0) {
                n / 2
            } else {
                n / 2 - 1
            }
        }
    }
}
