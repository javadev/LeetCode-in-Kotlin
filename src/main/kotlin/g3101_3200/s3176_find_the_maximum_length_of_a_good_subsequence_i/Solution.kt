package g3101_3200.s3176_find_the_maximum_length_of_a_good_subsequence_i

// #Medium #Array #Hash_Table #Dynamic_Programming
// #2024_06_15_Time_183_ms_(100.00%)_Space_37.6_MB_(91.30%)

import kotlin.math.max

class Solution {
    fun maximumLength(nums: IntArray, k: Int): Int {
        val n = nums.size
        var count = 0
        for (i in 0 until nums.size - 1) {
            if (nums[i] != nums[i + 1]) {
                count++
            }
        }
        if (count <= k) {
            return n
        }
        val max = IntArray(k + 1)
        max.fill(1)
        val vis = IntArray(n)
        vis.fill(-1)
        val map = HashMap<Int, Int>()
        for (i in 0 until n) {
            if (!map.containsKey(nums[i])) {
                map[nums[i]] = i + 1
            } else {
                vis[i] = map[nums[i]]!! - 1
                map[nums[i]] = i + 1
            }
        }
        val dp = Array(n) { IntArray(k + 1) }
        for (i in 0 until n) {
            for (j in 0..k) {
                dp[i][j] = 1
            }
        }
        for (i in 1 until n) {
            for (j in k - 1 downTo 0) {
                dp[i][j + 1] = max(dp[i][j + 1], (1 + max[j]))
                max[j + 1] = max(max[j + 1], dp[i][j + 1])
            }
            if (vis[i] != -1) {
                val a = vis[i]
                for (j in 0..k) {
                    dp[i][j] = max(dp[i][j], (1 + dp[a][j]))
                    max[j] = max(dp[i][j], max[j])
                }
            }
        }
        var ans = 1
        for (i in 0..k) {
            ans = max(ans, max[i])
        }
        return ans
    }
}
