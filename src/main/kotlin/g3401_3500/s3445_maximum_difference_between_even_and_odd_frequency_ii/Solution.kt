package g3401_3500.s3445_maximum_difference_between_even_and_odd_frequency_ii

// #Hard #String #Prefix_Sum #Sliding_Window #Enumeration
// #2025_02_05_Time_84_ms_(83.33%)_Space_50.62_MB_(66.67%)

import kotlin.math.max

class Solution {
    fun maxDifference(s: String, k: Int): Int {
        val n = s.length
        val pre = Array<IntArray>(5) { IntArray(n) }
        val closestRight = Array<IntArray>(5) { IntArray(n) }
        for (x in 0..4) {
            closestRight[x].fill(n)
            for (i in 0..<n) {
                val num = s[i].code - '0'.code
                pre[x][i] = if (num == x) 1 else 0
                if (i > 0) {
                    pre[x][i] += pre[x][i - 1]
                }
            }
            for (i in n - 1 downTo 0) {
                val num = s[i].code - '0'.code
                if (i < n - 1) {
                    closestRight[x][i] = closestRight[x][i + 1]
                }
                if (num == x) {
                    closestRight[x][i] = i
                }
            }
        }
        var ans = Int.Companion.MIN_VALUE
        for (a in 0..4) {
            for (b in 0..4) {
                if (a != b) {
                    ans = max(ans, go(k, a, b, pre, closestRight, n))
                }
            }
        }
        return ans
    }

    private fun go(k: Int, odd: Int, even: Int, pre: Array<IntArray>, closestRight: Array<IntArray>, n: Int): Int {
        val suf: Array<Array<IntArray>> = Array<Array<IntArray>>(2) { Array<IntArray>(2) { IntArray(n) } }
        for (arr2D in suf) {
            for (arr in arr2D) {
                arr.fill(Int.Companion.MIN_VALUE)
            }
        }
        for (endIdx in 0..<n) {
            val oddParity = pre[odd][endIdx] % 2
            val evenParity = pre[even][endIdx] % 2
            if (pre[odd][endIdx] > 0 && pre[even][endIdx] > 0) {
                suf[oddParity][evenParity][endIdx] = pre[odd][endIdx] - pre[even][endIdx]
            }
        }
        for (oddParity in 0..1) {
            for (evenParity in 0..1) {
                for (endIdx in n - 2 downTo 0) {
                    suf[oddParity][evenParity][endIdx] = max(
                        suf[oddParity][evenParity][endIdx],
                        suf[oddParity][evenParity][endIdx + 1],
                    )
                }
            }
        }
        var ans = Int.Companion.MIN_VALUE
        for (startIdx in 0..<n) {
            val minEndIdx = startIdx + k - 1
            if (minEndIdx >= n) {
                break
            }
            val oddBelowI = (if (startIdx == 0) 0 else pre[odd][startIdx - 1])
            val evenBelowI = (if (startIdx == 0) 0 else pre[even][startIdx - 1])
            val goodOddParity = (oddBelowI + 1) % 2
            val goodEvenParity = evenBelowI % 2
            val query = max(
                max((startIdx + k - 1), closestRight[odd][startIdx]),
                closestRight[even][startIdx],
            )
            if (query >= n) {
                continue
            }
            val `val` = suf[goodOddParity][goodEvenParity][query]
            if (`val` == Int.Companion.MIN_VALUE) {
                continue
            }
            ans = max(ans, (`val` - oddBelowI + evenBelowI))
        }
        return ans
    }
}
