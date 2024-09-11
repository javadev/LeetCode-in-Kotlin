package g3201_3300.s3281_maximize_score_of_numbers_in_ranges

// #Medium #Array #Sorting #Greedy #Binary_Search
// #2024_09_11_Time_710_ms_(88.24%)_Space_80.7_MB_(5.88%)

import kotlin.math.max

class Solution {
    fun maxPossibleScore(start: IntArray, d: Int): Int {
        start.sort()
        val n = start.size
        var l = 0
        var r = start[n - 1] - start[0] + d + 1
        while (l < r) {
            val m = l + (r - l) / 2
            if (isPossible(start, d, m)) {
                l = m + 1
            } else {
                r = m
            }
        }
        return l - 1
    }

    private fun isPossible(start: IntArray, d: Int, score: Int): Boolean {
        var pre = start[0]
        for (i in 1 until start.size) {
            if (start[i] + d - pre < score) {
                return false
            }
            pre = max(start[i], (pre + score))
        }
        return true
    }
}
