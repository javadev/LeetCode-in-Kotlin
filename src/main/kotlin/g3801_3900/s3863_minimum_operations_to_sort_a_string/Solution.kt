package g3801_3900.s3863_minimum_operations_to_sort_a_string

// #Medium #String #Staff #Weekly_Contest_492
// #2026_07_27_Time_15_ms_(74.44%)_Space_47.98_MB_(56.67%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minOperations(s: String): Int {
        val n = s.length
        if (n == 1) {
            return 0
        }
        if (n == 2) {
            return if (s.get(0) > s.get(1)) -1 else 0
        }
        var min = 'z'
        var max = 'a'
        val first = s.get(0)
        val last = s.get(n - 1)
        var prev = 'a'
        val cnt = IntArray(26)
        var sorted = true
        for (c in s.toCharArray()) {
            sorted = sorted and (prev <= c)
            min = min(min.code, c.code).toChar()
            max = max(max.code, c.code).toChar()
            prev = c
            cnt[c.code - 'a'.code]++
        }
        if (sorted) {
            return 0
        }
        return calculateOperations(first, last, min, max, cnt)
    }

    private fun calculateOperations(first: Char, last: Char, min: Char, max: Char, cnt: IntArray): Int {
        if (first == min || last == max) {
            return 1
        }
        if (first != max || last != min) {
            return 2
        }
        return if (cnt[max.code - 'a'.code] > 1 || cnt[min.code - 'a'.code] > 1) 2 else 3
    }
}
