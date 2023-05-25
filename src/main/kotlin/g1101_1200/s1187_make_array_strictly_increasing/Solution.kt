package g1101_1200.s1187_make_array_strictly_increasing

// #Hard #Array #Dynamic_Programming #Binary_Search

class Solution {
    fun makeArrayIncreasing(arr1: IntArray, arr2: IntArray): Int {
        arr2.sort()
        var start = 0
        for (i in arr2.indices) {
            if (arr2[i] != arr2[start]) {
                arr2[++start] = arr2[i]
            }
        }
        val l2 = start + 1
        val dp = IntArray(l2 + 2)
        for (i in arr1.indices) {
            var noChange = dp[dp.size - 1]
            if (i > 0 && arr1[i - 1] >= arr1[i]) {
                noChange = -1
            }
            for (j in dp.size - 2 downTo 1) {
                if (arr2[j - 1] < arr1[i] && dp[j] != -1) {
                    noChange = if (noChange == -1) dp[j] else Math.min(noChange, dp[j])
                }
                if (dp[j - 1] != -1) {
                    dp[j] = 1 + dp[j - 1]
                } else {
                    dp[j] = -1
                }
                if (i > 0 && arr1[i - 1] < arr2[j - 1] && dp[dp.size - 1] >= 0) {
                    dp[j] = if (dp[j] == -1) dp[dp.size - 1] + 1 else Math.min(dp[j], dp[dp.size - 1] + 1)
                }
            }
            dp[0] = -1
            dp[dp.size - 1] = noChange
        }
        var res = -1
        for (num in dp) {
            if (num != -1) {
                res = if (res == -1) num else Math.min(res, num)
            }
        }
        return res
    }
}
