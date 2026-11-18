package g3901_4000.s3999_minimum_number_of_string_groups_through_transformations

// #Hard #String #Hash_Table #Two_Pointers #Senior_Staff #Weekly_Contest_511
// #2026_11_17_Time_83_ms_(100.00%)_Space_60.37_MB_(97.83%)

import kotlin.math.min

class Solution {
    fun minimumGroups(words: Array<String>): Int {
        val set = HashSet<Long?>()
        for (w in words) {
            val n = w.length
            val evenLen = (n + 1) shr 1
            val oddLen = n shr 1
            val even = CharArray(evenLen)
            val odd = CharArray(oddLen)
            var ei = 0
            var oi = 0
            for (i in 0..<n) {
                if ((i and 1) == 0) {
                    even[ei++] = w.get(i)
                } else {
                    odd[oi++] = w.get(i)
                }
            }
            val eStart = booth(even)
            val oStart = booth(odd)
            val h1 = hash(even, eStart)
            val h2 = hash(odd, oStart)
            val key = h1 * 1000003L + h2
            set.add(key)
        }
        return set.size
    }

    private fun booth(s: CharArray): Int {
        val n = s.size
        if (n <= 1) {
            return 0
        }
        var i = 0
        var j = 1
        var k = 0
        while (i < n && j < n && k < n) {
            val a = s[(i + k) % n]
            val b = s[(j + k) % n]
            if (a == b) {
                k++
            } else if (a > b) {
                i += k + 1
                if (i <= j) {
                    i = j + 1
                }
                k = 0
            } else {
                j += k + 1
                if (j <= i) {
                    j = i + 1
                }
                k = 0
            }
        }
        return min(i, j)
    }

    private fun hash(s: CharArray, start: Int): Long {
        var h: Long = 0
        for (i in s.indices) {
            h = h * 131 + s[(start + i) % s.size].code.toLong()
        }
        return h
    }
}
