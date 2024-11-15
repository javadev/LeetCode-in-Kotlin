package g3301_3400.s3349_adjacent_increasing_subarrays_detection_i

// #Easy #Array #2024_11_15_Time_179_ms_(97.92%)_Space_37.3_MB_(91.67%)

class Solution {
    fun hasIncreasingSubarrays(nums: List<Int>, k: Int): Boolean {
        val l = nums.size
        if (l < k * 2) {
            return false
        }
        for (i in 0.rangeUntil(l - 2 * k + 1)) {
            if (check(i, k, nums) && check(i + k, k, nums)) {
                return true
            }
        }
        return false
    }

    private fun check(p: Int, k: Int, nums: List<Int>): Boolean {
        for (i in p.rangeUntil(p + k - 1)) {
            if (nums[i] >= nums[i + 1]) {
                return false
            }
        }
        return true
    }
}
