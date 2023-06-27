package g0901_1000.s0992_subarrays_with_k_different_integers

// #Hard #Array #Hash_Table #Counting #Sliding_Window
// #2023_05_12_Time_341_ms_(87.50%)_Space_67.7_MB_(12.50%)

class Solution {
    fun subarraysWithKDistinct(nums: IntArray, k: Int): Int {
        var res = 0
        var prefix = 0
        val cnt = IntArray(nums.size + 1)
        var i = 0
        var j = 0
        var uniqueCount = 0
        while (i < nums.size) {
            if (cnt[nums[i]]++ == 0) {
                uniqueCount++
            }
            if (uniqueCount > k) {
                --cnt[nums[j++]]
                prefix = 0
                uniqueCount--
            }
            while (cnt[nums[j]] > 1) {
                ++prefix
                --cnt[nums[j++]]
            }
            if (uniqueCount == k) {
                res += prefix + 1
            }
            i++
        }
        return res
    }
}
