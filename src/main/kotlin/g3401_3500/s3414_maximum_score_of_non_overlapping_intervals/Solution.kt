package g3401_3500.s3414_maximum_score_of_non_overlapping_intervals

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search
// #2025_01_09_Time_892_(100.00%)_Space_91.42_(100.00%)

class Solution {
    fun maximumWeight(intervals: List<List<Int>>): IntArray {
        val n = intervals.size
        val ns = intervals.mapIndexed { index, li -> intArrayOf(li[0], li[1], li[2], index) }.toTypedArray()
        ns.sortBy { it[0] }
        var dp1 = Array<IntArray>(n) { IntArray(0) }
        var dp = LongArray(n)
        repeat(4) {
            val dp3 = Array<IntArray>(n) { IntArray(0) }
            val dp2 = LongArray(n)
            dp3[n - 1] = intArrayOf(ns[n - 1][3])
            dp2[n - 1] = ns[n - 1][2].toLong()
            for (i in n - 2 downTo 0) {
                var l = i + 1
                var r = n - 1
                while (l <= r) {
                    val mid = (l + r) shr 1
                    if (ns[mid][0] > ns[i][1]) {
                        r = mid - 1
                    } else {
                        l = mid + 1
                    }
                }
                dp2[i] = ns[i][2] + (if (l < n) dp[l] else 0)
                if (i + 1 < n && dp2[i + 1] > dp2[i]) {
                    dp2[i] = dp2[i + 1]
                    dp3[i] = dp3[i + 1]
                } else {
                    if (l < n) {
                        dp3[i] = IntArray(dp1[l].size + 1)
                        dp3[i][0] = ns[i][3]
                        for (j in dp1[l].indices) {
                            dp3[i][j + 1] = dp1[l][j]
                        }
                        dp3[i].sort()
                    } else {
                        dp3[i] = intArrayOf(ns[i][3])
                    }
                    if (i + 1 < n && dp2[i + 1] == dp2[i] && check(dp3[i], dp3[i + 1]) > 0) {
                        dp3[i] = dp3[i + 1]
                    }
                }
            }
            dp = dp2
            dp1 = dp3
        }
        return dp1[0]
    }

    private fun check(ns1: IntArray, ns2: IntArray): Int {
        var i = 0
        while (i < ns1.size && i < ns2.size) {
            if (ns1[i] < ns2[i]) {
                return -1
            } else if (ns1[i] > ns2[i]) {
                return 1
            }
            i++
        }
        return 0
    }
}
