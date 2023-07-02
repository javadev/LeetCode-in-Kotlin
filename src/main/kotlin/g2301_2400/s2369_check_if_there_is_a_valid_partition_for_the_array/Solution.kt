package g2301_2400.s2369_check_if_there_is_a_valid_partition_for_the_array

// #Medium #Array #Dynamic_Programming
class Solution {
    fun validPartition(nums: IntArray): Boolean {
        val canPartition = BooleanArray(nums.size + 1)
        canPartition[0] = true
        var diff = nums[1] - nums[0]
        var equal = diff == 0
        var incOne = diff == 1
        canPartition[2] = equal
        for (i in 3 until canPartition.size) {
            diff = nums[i - 1] - nums[i - 2]
            if (diff == 0) {
                canPartition[i] = canPartition[i - 2] || equal && canPartition[i - 3]
                equal = true
                incOne = false
            } else if (diff == 1) {
                canPartition[i] = incOne && canPartition[i - 3]
                equal = false
                incOne = true
            }
        }
        return canPartition[nums.size]
    }
}
