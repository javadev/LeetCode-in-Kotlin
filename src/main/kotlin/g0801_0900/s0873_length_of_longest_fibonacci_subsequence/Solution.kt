package g0801_0900.s0873_length_of_longest_fibonacci_subsequence

// #Medium #Array #Hash_Table #Dynamic_Programming
// #2023_04_08_Time_341_ms_(90.00%)_Space_46.8_MB_(40.00%)

class Solution {
    fun lenLongestFibSubseq(arr: IntArray?): Int {
        if (arr == null || arr.size < 3) {
            return 0
        }
        val len = arr.size
        val dp = Array(len) { IntArray(len) }
        var ans = 0
        for (i in 2 until len) {
            var left = 0
            var right = i - 1
            while (left < right) {
                if (arr[left] + arr[right] < arr[i]) {
                    left++
                } else if (arr[left] + arr[right] > arr[i]) {
                    right--
                } else {
                    // dp[right][i] = Math.max(dp[right][i], dp[left][right] + 1);
                    dp[right][i] = dp[left][right] + 1
                    ans = Math.max(ans, dp[right][i])
                    left++
                    right--
                }
            }
        }
        return if (ans > 0) ans + 2 else 0
    }
}
