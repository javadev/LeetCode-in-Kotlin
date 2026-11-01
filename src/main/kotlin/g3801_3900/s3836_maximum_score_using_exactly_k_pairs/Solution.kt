package g3801_3900.s3836_maximum_score_using_exactly_k_pairs

// #Hard #Array #Dynamic_Programming #Senior_Staff #Weekly_Contest_488
// #2026_07_21_Time_117_ms_(91.80%)_Space_47.04_MB_(98.36%)

import kotlin.math.max

class Solution {
    fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {
        val n = nums1.size
        val m = nums2.size
        val negINF = -1000000000000000L
        if (n < m) {
            return maxScore(nums2, nums1, k)
        }
        var curr: Array<LongArray> = Array<LongArray>(m + 1) { LongArray(k + 1) }
        var prev: Array<LongArray> = Array<LongArray>(m + 1) { LongArray(k + 1) }
        for (i in 0..m) {
            prev[i].fill(negINF)
            prev[i][0] = 0
        }
        for (i in 1..n) {
            for (row in curr) {
                row.fill(negINF)
                row[0] = 0
            }
            for (j in 1..m) {
                for (p in 1..k) {
                    val option1 = nums1[i - 1].toLong() * nums2[j - 1] + prev[j - 1][p - 1]
                    val option2 = prev[j][p]
                    val option3 = curr[j - 1][p]
                    curr[j][p] = max(option1, max(option2, option3))
                }
            }
            val temp = prev
            prev = curr
            curr = temp
        }
        return prev[m][k]
    }
}
