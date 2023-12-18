package g2801_2900.s2834_find_the_minimum_possible_sum_of_a_beautiful_array

// #Medium #Math #Greedy #2023_12_18_Time_130_ms_(100.00%)_Space_33.9_MB_(100.00%)

class Solution {
    fun minimumPossibleSum(n: Int, target: Int): Int {
        val mod = 1e9.toLong() + 7
        if (target > (n + n - 1)) {
            return (n.toLong() * (n + 1) % mod / 2).toInt()
        }
        val toChange = n - (target / 2).toLong()
        val sum = ((n * (n.toLong() + 1)) / 2) % mod
        val remain = target.toLong() - ((target / 2) + 1)
        return ((sum + (toChange * remain) % mod) % mod).toInt()
    }
}
