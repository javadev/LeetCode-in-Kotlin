package g2001_2100.s2053_kth_distinct_string_in_an_array

// #Easy #Array #String #Hash_Table #Counting
// #2023_06_25_Time_181_ms_(90.00%)_Space_36.9_MB_(90.00%)

class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val m: MutableMap<String, Int> = HashMap()
        for (value in arr) {
            m[value] = m.getOrDefault(value, 0) + 1
        }
        var c = 0
        for (s in arr) {
            if (m[s] == 1) {
                ++c
                if (c == k) {
                    return s
                }
            }
        }
        return ""
    }
}
