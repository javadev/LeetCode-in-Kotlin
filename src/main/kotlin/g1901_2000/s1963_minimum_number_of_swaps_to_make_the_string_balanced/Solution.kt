package g1901_2000.s1963_minimum_number_of_swaps_to_make_the_string_balanced

// #Medium #String #Greedy #Two_Pointers #Stack
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
