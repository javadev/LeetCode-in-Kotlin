package g0701_0800.s0791_custom_sort_string

// #Medium #String #Hash_Table #Sorting #2023_03_13_Time_133_ms_(90.00%)_Space_33.7_MB_(90.00%)

class Solution {
    fun customSortString(order: String, s: String): String {
        val ord = IntArray(26)
        val sb = StringBuilder()
        for (c in s.toCharArray()) {
            ord[c.code - 'a'.code]++
        }
        for (c in order.toCharArray()) {
            while (ord[c.code - 'a'.code]-- > 0) {
                sb.append(c)
            }
        }
        for (c in s.toCharArray()) {
            while (ord[c.code - 'a'.code]-- > 0) {
                sb.append(c)
            }
        }
        return sb.toString()
    }
}
