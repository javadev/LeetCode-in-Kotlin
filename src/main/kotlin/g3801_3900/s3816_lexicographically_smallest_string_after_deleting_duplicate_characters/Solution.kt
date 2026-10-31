package g3801_3900.s3816_lexicographically_smallest_string_after_deleting_duplicate_characters

// #Hard #String #Hash_Table #Greedy #Stack #Monotonic_Stack #Senior_Staff #Weekly_Contest_485
// #2026_06_09_Time_65_ms_(91.61%)_Space_47.86_MB_(91.61%)

class Solution {
    fun lexSmallestAfterDeletion(s: String): String {
        val a = s.toCharArray()
        val rem = IntArray(26)
        for (c in a) {
            rem[c.code - 'a'.code]++
        }
        val cnt = IntArray(26)
        val sb = StringBuilder()
        for (c in a) {
            rem[c.code - 'a'.code]--
            while (!sb.isEmpty()) {
                val t = sb.get(sb.length - 1)
                if (t > c && (rem[t.code - 'a'.code] > 0 || cnt[t.code - 'a'.code] > 1)) {
                    cnt[t.code - 'a'.code]--
                    sb.setLength(sb.length - 1)
                } else {
                    break
                }
            }
            sb.append(c)
            cnt[c.code - 'a'.code]++
        }
        while (!sb.isEmpty()) {
            val i = sb.length - 1
            val c = sb.get(i)
            if (cnt[c.code - 'a'.code] > 1) {
                cnt[c.code - 'a'.code]--
                sb.setLength(i)
            } else {
                break
            }
        }
        return sb.toString()
    }
}
