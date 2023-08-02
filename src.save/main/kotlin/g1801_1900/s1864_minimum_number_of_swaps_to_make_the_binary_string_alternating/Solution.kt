package g1801_1900.s1864_minimum_number_of_swaps_to_make_the_binary_string_alternating

// #Medium #String #Greedy #2023_06_22_Time_140_ms_(100.00%)_Space_33.4_MB_(100.00%)

class Solution {
    fun minSwaps(s: String): Int {
        val count = Array(2) { IntArray(2) }
        for (i in 0 until s.length) {
            val c = s[i]
            if (i % 2 == 0) {
                count[0][c.code - '0'.code]++
            } else {
                count[1][c.code - '0'.code]++
            }
        }
        if (count[0][0] == 0 && count[1][1] == 0 || count[0][1] == 0 && count[1][0] == 0) {
            return 0
        }
        if (count[0][0] != count[1][1] && count[0][1] != count[1][0]) {
            return -1
        }
        val ans1 = if (count[0][0] == count[1][1]) count[0][0] else Int.MAX_VALUE
        val ans2 = if (count[0][1] == count[1][0]) count[0][1] else Int.MAX_VALUE
        return Math.min(ans1, ans2)
    }
}
