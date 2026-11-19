package g4001_4100.s4016_maximum_area_of_two_non_overlapping_square_submatrices

// #Medium #Array #Dynamic_Programming #Binary_Search #Matrix #Staff #Weekly_Contest_514
// #2026_11_19_Time_12_ms_(98.63%)_Space_183.92_MB_(94.52%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(mat: Array<IntArray>): Int {
        val m = mat.size
        val n = mat[0].size
        val dp = Array<IntArray>(m) { IntArray(n) }
        val top = IntArray(m)
        val bottom = IntArray(m)
        val left = IntArray(n)
        val right = IntArray(n)
        for (r in 0..<m) {
            for (c in 0..<n) {
                if (mat[r][c] == 0) {
                    continue
                }
                if (r == 0 || c == 0) {
                    dp[r][c] = 1
                } else {
                    dp[r][c] = 1 + min(dp[r - 1][c - 1], min(dp[r - 1][c], dp[r][c - 1]))
                }
                val k = dp[r][c]
                top[r] = max(top[r], k)
                left[c] = max(left[c], k)
                bottom[r - k + 1] = max(bottom[r - k + 1], k)

                right[c - k + 1] = max(right[c - k + 1], k)
            }
        }
        for (r in 1..<m) {
            top[r] = max(top[r], top[r - 1])
        }
        for (c in 1..<n) {
            left[c] = max(left[c], left[c - 1])
        }
        for (r in m - 2 downTo 0) {
            bottom[r] = max(bottom[r], bottom[r + 1])
        }
        for (c in n - 2 downTo 0) {
            right[c] = max(right[c], right[c + 1])
        }
        var best = 0
        for (r in 0..<m - 1) {
            best = max(best, min(top[r], bottom[r + 1]))
        }
        for (c in 0..<n - 1) {
            best = max(best, min(left[c], right[c + 1]))
        }
        return best * best
    }
}
