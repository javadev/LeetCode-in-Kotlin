package g1601_1700.s1691_maximum_height_by_stacking_cuboids

import java.util.Arrays

// #Hard #Array #Dynamic_Programming #Sorting
class Solution {
    fun maxHeight(arr: Array<IntArray>): Int {
        for (a in arr) {
            a.sort()
        }
        Arrays.sort(
            arr
        ) { a: IntArray, b: IntArray ->
            if (a[0] != b[0]) {
                return@sort a[0] - b[0]
            } else if (a[1] != b[1]) {
                return@sort a[1] - b[1]
            }
            a[2] - b[2]
        }
        var ans = 0
        val dp = IntArray(arr.size)
        for (i in arr.indices) {
            dp[i] = arr[i][2]
            for (j in 0 until i) {
                if (arr[i][0] >= arr[j][0] && arr[i][1] >= arr[j][1] && arr[i][2] >= arr[j][2]) {
                    dp[i] = Math.max(dp[i], arr[i][2] + dp[j])
                }
            }
            ans = Math.max(ans, dp[i])
        }
        return ans
    }
}
