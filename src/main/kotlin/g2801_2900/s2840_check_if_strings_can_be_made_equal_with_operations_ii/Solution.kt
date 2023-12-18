package g2801_2900.s2840_check_if_strings_can_be_made_equal_with_operations_ii

// #Medium #String #Hash_Table #Sorting #2023_12_18_Time_225_ms_(100.00%)_Space_39.7_MB_(50.00%)

class Solution {
    fun checkStrings(s1: String, s2: String): Boolean {
        return check(0, s1, s2) && check(1, s1, s2)
    }

    fun check(start: Int, s1: String, s2: String): Boolean {
        val step = 2
        val buf = IntArray(26)
        var i = start
        while (i < s1.length) {
            buf[s1[i].code - 'a'.code]++
            buf[s2[i].code - 'a'.code]--
            i += step
        }
        for (j in buf) {
            if (j != 0) {
                return false
            }
        }
        return true
    }
}
