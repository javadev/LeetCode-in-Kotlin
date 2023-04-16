package g0901_1000.s0915_partition_array_into_disjoint_intervals

// #Medium #Array #2023_04_16_Time_510_ms_(76.92%)_Space_53.2_MB_(69.23%)

class Solution {
    fun partitionDisjoint(nums: IntArray): Int {
        var res = 0
        var leftMax = nums[0]
        var greater = nums[0]
        for (i in 1 until nums.size) {
            if (greater <= nums[i]) {
                greater = nums[i]
            } else if (nums[i] < leftMax) {
                res = i
                leftMax = greater
            }
        }
        return res + 1
    }
}
