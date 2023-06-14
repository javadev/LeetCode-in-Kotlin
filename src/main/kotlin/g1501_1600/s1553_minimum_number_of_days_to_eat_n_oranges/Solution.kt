package g1501_1600.s1553_minimum_number_of_days_to_eat_n_oranges

// #Hard #Dynamic_Programming #Memoization #2023_06_14_Time_153_ms_(100.00%)_Space_35.2_MB_(100.00%)

class Solution {
    fun minDays(n: Int): Int {
        return eat(n, HashMap())
    }

    private fun eat(n: Int, cache: MutableMap<Int, Int>): Int {
        if (n <= 1) {
            return n
        }
        val cached = cache[n]
        if (cached != null) {
            return cached
        }
        val result = (n % 2 + eat(n / 2, cache)).coerceAtMost(n % 3 + eat(n / 3, cache)) + 1
        cache[n] = result
        return result
    }
}