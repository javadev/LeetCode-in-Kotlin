package g1601_1700.s1688_count_of_matches_in_tournament

// #Easy #Math #Simulation
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
