package g1201_1300.s1209_remove_all_adjacent_duplicates_in_string_ii

// #Medium #String #Stack #2023_06_10_Time_223_ms_(100.00%)_Space_38.1_MB_(88.89%)

class Solution {
    fun removeDuplicates(s: String, k: Int): String {
        val sb = StringBuilder()
        var dupCount = 0
        for (i in s.indices) {
            if (sb.isNotEmpty() && sb[sb.length - 1] == s[i]) {
                dupCount++
            } else {
                dupCount = 1
            }
            sb.append(s[i])
            if (dupCount == k) {
                sb.setLength(sb.length - k)
                if (i + 1 < s.length) {
                    dupCount = 0
                    for (j in sb.length - 1 downTo 0) {
                        if (sb[j] == s[i + 1]) {
                            dupCount++
                        } else {
                            break
                        }
                    }
                }
            }
        }
        return sb.toString()
    }
}
