package g1601_1700.s1691_maximum_height_by_stacking_cuboids

// #Hard #Array #Dynamic_Programming #Sorting
// #2023_06_15_Time_187_ms_(100.00%)_Space_38.6_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun maxHeight(cuboids: Array<IntArray>): Int {
        for (a in cuboids) {
            a.sort()
        }
        Arrays.sort(
            cuboids
        ) { a: IntArray, b: IntArray ->
            if (a[0] != b[0]) {
                return@sort a[0] - b[0]
            } else if (a[1] != b[1]) {
                return@sort a[1] - b[1]
            }
            a[2] - b[2]
        }
        var ans = 0
        val dp = IntArray(cuboids.size)
        for (i in cuboids.indices) {
            dp[i] = cuboids[i][2]
            for (j in 0 until i) {
                if (cuboids[i][0] >= cuboids[j][0] &&
                    cuboids[i][1] >= cuboids[j][1] && cuboids[i][2] >= cuboids[j][2]
                ) {
                    dp[i] = Math.max(dp[i], cuboids[i][2] + dp[j])
                }
            }
            ans = Math.max(ans, dp[i])
        }
        return ans
    }
}
