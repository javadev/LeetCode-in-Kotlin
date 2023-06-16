package g1701_1800.s1787_make_the_xor_of_all_segments_equal_to_zero

// #Hard #Array #Dynamic_Programming #Bit_Manipulation
class Solution {
    fun minChanges(nums: IntArray, k: Int): Int {
        val n = nums.size
        val fre = Array(k) { IntArray(1024) }
        for (i in 0 until n) {
            fre[i % k][nums[i]]++
        }
        var dp = IntArray(1024)
        dp.fill(-n)
        dp[0] = 0
        var max = 0
        for (i in 0 until k) {
            val dp2 = IntArray(1024)
            dp2.fill(max)
            var max2 = 0
            for (xor in 0..1023) {
                var al = i
                while (al < n) {
                    dp2[xor] = Math.max(dp2[xor], dp[xor xor nums[al]] + fre[i][nums[al]])
                    al += k
                }
                max2 = Math.max(max2, dp2[xor])
            }
            max = max2
            dp = dp2
        }
        return n - dp[0]
    }
}
