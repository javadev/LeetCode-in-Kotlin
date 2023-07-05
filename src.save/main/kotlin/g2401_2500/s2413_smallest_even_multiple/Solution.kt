package g2401_2500.s2413_smallest_even_multiple

// #Easy #Math #Number_Theory #2023_07_04_Time_121_ms_(85.71%)_Space_33.1_MB_(66.67%)

class Solution {
    fun smallestEvenMultiple(n: Int): Int {
        return if (n % 2 == 0) n else n * 2
    }
}
