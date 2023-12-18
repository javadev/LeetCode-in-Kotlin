package g2801_2900.s2839_check_if_strings_can_be_made_equal_with_operations_i

// #Easy #String #2023_12_18_Time_154_ms_(100.00%)_Space_35.3_MB_(83.33%)

class Solution {
    fun canBeEqual(s1: String, s2: String): Boolean {
        return isOk(s1, s2, 0) && isOk(s1, s2, 1)
    }

    private fun isOk(s1: String, s2: String, i: Int): Boolean {
        val a = s1[i]
        val b = s1[i + 2]
        val c = s2[i]
        val d = s2[i + 2]
        if (a == c && b == d) {
            return true
        }
        return a == d && b == c
    }
}
