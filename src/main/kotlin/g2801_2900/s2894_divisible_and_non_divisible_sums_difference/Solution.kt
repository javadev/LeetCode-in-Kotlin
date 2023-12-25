package g2801_2900.s2894_divisible_and_non_divisible_sums_difference

// #Easy #Math #2023_12_25_Time_135_ms_(76.92%)_Space_33.7_MB_(69.23%)

class Solution {
    fun differenceOfSums(n: Int, m: Int): Int {
        var sum1 = 0
        var sum2 = 0
        for (i in 1..n) {
            if (i % m == 0) {
                sum1 += i
            } else {
                sum2 += i
            }
        }
        return sum2 - sum1
    }
}
