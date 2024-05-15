package g3101_3200.s3146_permutation_difference_between_two_strings

// #Easy #String #Hash_Table #2024_05_15_Time_177_ms_(58.21%)_Space_38.1_MB_(7.46%)

import kotlin.math.abs

class Solution {
    fun findPermutationDifference(s: String, t: String): Int {
        val res = IntArray(26)
        res.fill(-1)
        var sum = 0
        for (i in s.indices) {
            res[s[i].code - 'a'.code] = i
        }
        for (i in t.indices) {
            sum += abs((res[t[i].code - 'a'.code] - i))
        }
        return sum
    }
}
