package g1301_1400.s1340_jump_game_v

// #Hard #Array #Dynamic_Programming #Sorting
// #2023_06_06_Time_208_ms_(100.00%)_Space_38_MB_(100.00%)

class Solution {
    fun maxJumps(arr: IntArray, d: Int): Int {
        val n = arr.size
        var res = 0
        var top = 0
        val dp = IntArray(n)
        val stack = IntArray(n)
        for (i in 0..n) {
            while (top > 0 && (i == n || arr[stack[top - 1]] < arr[i])) {
                val r = top - 1
                var l = r - 1
                while (l >= 0 && arr[stack[l]] == arr[stack[r]]) l--
                for (j in l + 1..r) {
                    if (l >= 0 && stack[j] - stack[l] <= d) dp[stack[l]] = Math.max(dp[stack[l]], 1 + dp[stack[j]])
                    if (i < n && i - stack[j] <= d) dp[i] = Math.max(dp[i], 1 + dp[stack[j]])
                }
                top -= r - l
            }
            stack[top++] = i
        }
        for (i in 0 until n) res = Math.max(res, dp[i])
        return res + 1
    }
}
