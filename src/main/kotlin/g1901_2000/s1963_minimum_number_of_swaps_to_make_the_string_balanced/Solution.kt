package g1901_2000.s1963_minimum_number_of_swaps_to_make_the_string_balanced

// #Medium #String #Greedy #Two_Pointers #Stack
// #2023_06_21_Time_291_ms_(53.85%)_Space_50.7_MB_(92.31%)

class Solution {
    fun minSwaps(s: String): Int {
        var openCount = 0
        var swap = 0
        for (c in s.toCharArray()) {
            if (c == '[') {
                openCount++
            } else {
                if (openCount == 0) {
                    swap++
                    openCount++
                } else {
                    openCount--
                }
            }
        }
        return swap
    }
}
