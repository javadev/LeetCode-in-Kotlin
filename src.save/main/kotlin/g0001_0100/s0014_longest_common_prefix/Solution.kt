package g0001_0100.s0014_longest_common_prefix

// #Easy #Top_Interview_Questions #String #Level_2_Day_2_String #Udemy_Strings
// #2022_10_06_Time_209_ms_(88.86%)_Space_35.8_MB_(81.15%)

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
        while (temp.length > 0 && i < strs.size) {
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
