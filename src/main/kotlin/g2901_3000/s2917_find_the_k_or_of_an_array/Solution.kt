package g2901_3000.s2917_find_the_k_or_of_an_array

// #Easy #Array #Bit_Manipulation #2023_12_31_Time_191_ms_(76.47%)_Space_36.8_MB_(100.00%)

class Solution {
    fun findKOr(nums: IntArray, k: Int): Int {
        val dp = IntArray(31)
        for (num in nums) {
            var i = 0
            var localNum = num
            while (localNum > 0) {
                if ((localNum and 1) == 1) {
                    dp[i] += 1
                }
                i += 1
                localNum = localNum shr 1
            }
        }
        var ans = 0
        for (i in 0..30) {
            if (dp[i] >= k) {
                ans += (1 shl i)
            }
        }
        return ans
    }
}
