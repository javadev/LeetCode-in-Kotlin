package g0401_0500.s0485_max_consecutive_ones

// #Easy #Array #2023_01_02_Time_272_ms_(88.46%)_Space_39.2_MB_(73.08%)

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxLen = 0
        var i = 0
        while (i < nums.size) {
            var currentLen = 0
            while (i < nums.size && nums[i] == 1) {
                i++
                currentLen++
            }
            maxLen = Math.max(maxLen, currentLen)
            i++
        }
        return maxLen
    }
}
