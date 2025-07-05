package g0001_0100.s0014_longest_common_prefix

// #Easy #Top_Interview_Questions #String #Level_2_Day_2_String #Udemy_Strings
// #Top_Interview_150_Array/String #Big_O_Time_O(n*m)_Space_O(m)
// #2023_07_03_Time_154_ms_(89.70%)_Space_34.6_MB_(95.06%)

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        if (strs.size == 1) {
            return strs[0]
        }
        var temp = strs[0]
        var i = 1
        var cur: String
        while (temp.isNotEmpty() && i < strs.size) {
            if (temp.length > strs[i].length) {
                temp = temp.substring(0, strs[i].length)
            }
            cur = strs[i].substring(0, temp.length)
            if (cur != temp) {
                temp = temp.substring(0, temp.length - 1)
            } else {
                i++
            }
        }
        return temp
    }
}
