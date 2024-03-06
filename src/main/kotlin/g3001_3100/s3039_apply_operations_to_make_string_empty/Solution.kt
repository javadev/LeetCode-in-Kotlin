package g3001_3100.s3039_apply_operations_to_make_string_empty

// #Medium #Array #Hash_Table #Sorting #Counting
// #2024_03_06_Time_335_ms_(97.73%)_Space_49.8_MB_(81.82%)

import kotlin.math.max

class Solution {
    fun lastNonEmptyString(s: String): String {
        val freq = IntArray(26)
        val ar = s.toCharArray()
        val n = ar.size
        var max = 1
        val sb = StringBuilder()
        for (c in ar) {
            freq[c.code - 'a'.code]++
            max = max(freq[c.code - 'a'.code].toDouble(), max.toDouble()).toInt()
        }
        for (i in n - 1 downTo 0) {
            if (freq[ar[i].code - 'a'.code] == max) {
                sb.append(ar[i])
                freq[ar[i].code - 'a'.code] = 0
            }
        }
        return sb.reverse().toString()
    }
}
