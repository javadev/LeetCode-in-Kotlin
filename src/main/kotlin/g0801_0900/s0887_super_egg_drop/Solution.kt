package g0801_0900.s0887_super_egg_drop

// #Hard #Dynamic_Programming #Math #Binary_Search
// #2023_04_09_Time_119_ms_(100.00%)_Space_33_MB_(75.00%)

class Solution {
    fun superEggDrop(k: Int, n: Int): Int {
        val dp = IntArray(k + 1)
        var counter = 1
        while (true) {
            var temp = dp[0]
            for (i in 1 until dp.size) {
                val localValue = dp[i] + temp + 1
                temp = dp[i]
                dp[i] = localValue
                if (localValue >= n) {
                    return counter
                }
            }
            counter += 1
        }
    }
}
