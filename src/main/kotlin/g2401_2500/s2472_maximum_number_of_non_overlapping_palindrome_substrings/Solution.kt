package g2401_2500.s2472_maximum_number_of_non_overlapping_palindrome_substrings

// #Hard #String #Dynamic_Programming
class Solution {
    fun maxPalindromes(s: String, k: Int): Int {
        val dp = IntArray(s.length)
        dp.fill(-1)
        return dfs(s, dp, k, 0)
    }

    private fun dfs(s: String, dp: IntArray, k: Int, start: Int): Int {
        if (start >= s.length) {
            return 0
        }
        if (dp[start] != -1) {
            return dp[start]
        }
        var ans = 0
        for (n in 0..1) {
            for (i in start..s.length - k - n) {
                var left = i
                var right = i + k + n - 1
                while (left < right) {
                    if (s[left] != s[right]) {
                        break
                    }
                    left++
                    right--
                }
                if (left >= right) {
                    ans = Math.max(ans, 1 + dfs(s, dp, k, i + k + n))
                    break
                }
            }
        }
        dp[start] = ans
        return ans
    }
}
