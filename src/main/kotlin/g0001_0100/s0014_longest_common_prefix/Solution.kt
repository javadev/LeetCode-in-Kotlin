package g0001_0100.s0014_longest_common_prefix

// #Easy #Top_Interview_Questions #String #2022_03_29_Time_269_ms_(48.51%)_Space_34.8_MB_(98.92%)

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
