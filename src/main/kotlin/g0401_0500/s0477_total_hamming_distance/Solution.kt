package g0401_0500.s0477_total_hamming_distance

// #Medium #Array #Math #Bit_Manipulation #2023_01_01_Time_298_ms_(100.00%)_Space_38.6_MB_(100.00%)

class Solution {
    fun totalHammingDistance(nums: IntArray): Int {
        var ans = 0
        val n = nums.size
        for (i in 0..31) {
            var ones = 0
            for (k in nums) {
                ones += k shr i and 1
            }
            ans = ans + ones * (n - ones)
        }
        return ans
    }
}
