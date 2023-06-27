package g1001_1100.s1021_remove_outermost_parentheses

// #Easy #String #Stack #2023_05_22_Time_156_ms_(60.00%)_Space_37.3_MB_(40.00%)

class Solution {
    fun removeOuterParentheses(s: String): String {
        val primitives: MutableList<String> = ArrayList()
        var i = 1
        while (i < s.length) {
            val initialI = i - 1
            var left = 1
            while (i < s.length && left > 0) {
                if (s[i] == '(') {
                    left++
                } else {
                    left--
                }
                i++
            }
            primitives.add(s.substring(initialI, i))
            i++
        }
        val sb = StringBuilder()
        for (primitive in primitives) {
            sb.append(primitive, 1, primitive.length - 1)
        }
        return sb.toString()
    }
}
