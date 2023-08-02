package g2601_2700.s2652_sum_multiples

// #Easy #Array #Math #Number_Theory #2023_07_20_Time_136_ms_(97.53%)_Space_33.8_MB_(54.32%)

class Solution {
    fun sumOfMultiples(n: Int): Int {
        fun sumOfDivisible(value: Int): Int {
            val high = n / value * value
            val count = (high + value - value) / value
            return (value + high) * count / 2
        }
        return sumOfDivisible(3) + sumOfDivisible(5) + sumOfDivisible(7) -
            (sumOfDivisible(15) + sumOfDivisible(35) + sumOfDivisible(21)) +
            sumOfDivisible(105)
    }
}
