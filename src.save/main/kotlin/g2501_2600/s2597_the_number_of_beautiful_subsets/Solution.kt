package g2501_2600.s2597_the_number_of_beautiful_subsets

// #Medium #Array #Dynamic_Programming #Backtracking
// #2023_07_12_Time_194_ms_(100.00%)_Space_36.7_MB_(100.00%)

class Solution {
    fun beautifulSubsets(nums: IntArray, k: Int): Int {
        val map: MutableMap<Int, Int> = HashMap()
        for (n in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
        }
        var res = 1
        for (key in map.keys) {
            if (!map.containsKey(key - k)) {
                if (!map.containsKey(key + k)) {
                    res *= 1 shl map[key]!!
                } else {
                    val freq: MutableList<Int?> = ArrayList()
                    var localKey = key
                    while (map.containsKey(localKey)) {
                        freq.add(map[localKey])
                        localKey += k
                    }
                    res *= helper(freq)
                }
            }
        }
        return res - 1
    }

    private fun helper(freq: List<Int?>): Int {
        val n = freq.size
        if (n == 1) {
            return 1 shl freq[0]!!
        }
        val dp = IntArray(n)
        dp[0] = (1 shl freq[0]!!) - 1
        dp[1] = (1 shl freq[1]!!) - 1
        if (n == 2) {
            return dp[0] + dp[1] + 1
        }
        for (i in 2 until n) {
            if (i > 2) {
                dp[i - 2] += dp[i - 3]
            }
            dp[i] = (dp[i - 2] + 1) * ((1 shl freq[i]!!) - 1)
        }
        return dp[n - 1] + dp[n - 2] + dp[n - 3] + 1
    }
}
