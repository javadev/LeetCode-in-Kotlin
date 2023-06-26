package g2101_2200.s2180_count_integers_with_even_digit_sum

// #Easy #Math #Simulation #2023_06_26_Time_126_ms_(100.00%)_Space_33_MB_(100.00%)

class Solution {
    fun countEven(num: Int): Int {
        // Digit sum of the last number, we can get each digit this way sicne the range is [1, 1000]
        val sum = num % 10 + num / 10 % 10 + num / 100 % 10 + num / 1000 % 10

        // Check the parity of the digit sum of the last number
        return (num - (sum and 1)) / 2
    }
}