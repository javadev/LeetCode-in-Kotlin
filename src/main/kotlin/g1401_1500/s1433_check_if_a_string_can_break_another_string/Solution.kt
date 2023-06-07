package g1401_1500.s1433_check_if_a_string_can_break_another_string

import java.util.Objects

// #Medium #String #Sorting #Greedy
class Solution {
    fun checkIfCanBreak(s1: String?, s2: String?): Boolean {
        if (s1 == null && s2 == null || Objects.requireNonNull(s1)?.length == 1) {
            return true
        }
        val count1 = IntArray(26)
        val count2 = IntArray(26)
        for (i in s1!!.length - 1 downTo 0) {
            count1[s1[i].code - 'a'.code]++
            count2[s2!![i].code - 'a'.code]++
        }
        var isS1Greater = count1[25] >= count2[25]
        var isS2Greater = count2[25] >= count1[25]
        var i = 24
        while ((isS1Greater || isS2Greater) && i >= 0) {
            count1[i] += count1[i + 1]
            count2[i] += count2[i + 1]
            isS1Greater = isS1Greater && count1[i] >= count2[i]
            isS2Greater = isS2Greater && count2[i] >= count1[i]
            i--
        }
        return isS1Greater || isS2Greater
    }
}
