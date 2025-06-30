package g3501_3600.s3598_longest_common_prefix_between_adjacent_strings_after_removals

// #Medium #Array #String #2025_06_30_Time_28_ms_(71.43%)_Space_81.21_MB_(71.43%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun solve(a: String, b: String): Int {
        val len = min(a.length, b.length)
        var cnt = 0
        while (cnt < len && a[cnt] == b[cnt]) {
            cnt++
        }
        return cnt
    }

    fun longestCommonPrefix(words: Array<String>): IntArray {
        val n = words.size
        val ans = IntArray(n)
        if (n <= 1) {
            return ans
        }
        val lcp = IntArray(n - 1)
        run {
            var i = 0
            while (i + 1 < n) {
                lcp[i] = solve(words[i], words[i + 1])
                i++
            }
        }
        val prefmax = IntArray(n - 1)
        val sufmax = IntArray(n - 1)
        prefmax[0] = lcp[0]
        for (i in 1..<n - 1) {
            prefmax[i] = max(prefmax[i - 1], lcp[i])
        }
        sufmax[n - 2] = lcp[n - 2]
        for (i in n - 3 downTo 0) {
            sufmax[i] = max(sufmax[i + 1], lcp[i])
        }
        for (i in 0..<n) {
            var best = 0
            if (i >= 2) {
                best = max(best, prefmax[i - 2])
            }
            if (i + 1 <= n - 2) {
                best = max(best, sufmax[i + 1])
            }
            if (i > 0 && i < n - 1) {
                best = max(best, solve(words[i - 1], words[i + 1]))
            }
            ans[i] = best
        }
        return ans
    }
}
