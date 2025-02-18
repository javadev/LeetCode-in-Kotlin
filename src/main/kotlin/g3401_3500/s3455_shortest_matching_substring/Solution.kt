package g3401_3500.s3455_shortest_matching_substring

// #Hard #String #Binary_Search #Two_Pointers #String_Matching
// #2025_02_18_Time_100_ms_(100.00%)_Space_52.17_MB_(100.00%)

import kotlin.math.min

class Solution {
    private fun getMatch(s: String, p: String): MutableList<Int> {
        val n = s.length
        val m = p.length
        val next = IntArray(m)
        next.fill(-1)
        var i = 1
        var j = -1
        while (i < m) {
            while (j != -1 && p[i] != p[j + 1]) {
                j = next[j]
            }
            if (p[i] == p[j + 1]) {
                ++j
            }
            next[i] = j
            ++i
        }
        val match: MutableList<Int> = ArrayList<Int>()
        i = 0
        j = -1
        while (i < n) {
            while (j != -1 && s[i] != p[j + 1]) {
                j = next[j]
            }
            if (s[i] == p[j + 1]) {
                ++j
            }
            if (j == m - 1) {
                match.add(i - m + 1)
                j = next[j]
            }
            ++i
        }
        return match
    }

    fun shortestMatchingSubstring(s: String, p: String): Int {
        val n = s.length
        val m = p.length
        val d = intArrayOf(-1, -1, -1, m)
        for (i in 0..<m) {
            if (p[i] == '*') {
                d[if (d[1] == -1) 1 else 2] = i
            }
        }
        val subs: MutableList<String> = ArrayList<String>()
        for (i in 0..2) {
            if (d[i] + 1 < d[i + 1]) {
                subs.add(p.substring(d[i] + 1, d[i + 1]))
            }
        }
        val size = subs.size
        if (size == 0) {
            return 0
        }
        val matches: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        for (sub in subs) {
            matches.add(getMatch(s, sub))
        }
        var ans = Int.Companion.MAX_VALUE
        val ids = IntArray(size)
        ids.fill(0)
        while (ids[size - 1] < matches[size - 1].size) {
            for (i in size - 2 downTo 0) {
                while (ids[i] + 1 < matches[i].size &&
                    (
                        matches[i][ids[i] + 1] + subs[i].length
                            <= matches[i + 1][ids[i + 1]]
                        )
                ) {
                    ++ids[i]
                }
            }
            var valid = true
            for (i in size - 2 downTo 0) {
                if (ids[i] >= matches[i].size ||
                    (
                        matches[i][ids[i]] + subs[i].length
                            > matches[i + 1][ids[i + 1]]
                        )
                ) {
                    valid = false
                    break
                }
            }
            if (valid) {
                ans = min(
                    ans,
                    (
                        matches[size - 1][ids[size - 1]] +
                            subs[size - 1].length -
                            matches[0][ids[0]]
                        ),
                )
            }
            ids[size - 1]++
        }
        return if (ans > n) -1 else ans
    }
}
