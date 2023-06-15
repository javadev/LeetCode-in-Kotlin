package g1601_1700.s1688_count_of_matches_in_tournament

// #Easy #Math #Simulation #2023_06_15_Time_124_ms_(83.33%)_Space_32.8_MB_(75.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun numberOfMatches(n: Int): Int {
        var n = n
        var matches = 0
        while (n > 1) {
            if (n % 2 == 0) {
                matches += n / 2
                n /= 2
            } else {
                matches += (n - 1) / 2
                n = (n + 1) / 2
            }
        }
        return matches
    }
}
